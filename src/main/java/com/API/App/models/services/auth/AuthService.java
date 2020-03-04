package com.API.App.models.services.auth;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.API.App.models.dao.auth.IAuthDao;
import com.API.App.models.entity.Usuario;

@Service
public class AuthService implements UserDetailsService , IAuthService{

	private Logger logger = LoggerFactory.getLogger(AuthService.class);
	@Autowired
	private IAuthDao authDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = authDao.findByUsername(username);
		
		if (usuario == null) {
			logger.error("Error: el correo: '"+usuario+"' no existe en los registros");
			throw new UsernameNotFoundException("Error: el correo: '"+usuario+"' no existe en los registros");
		}
		
		List<GrantedAuthority> authorities = usuario.getRoles()
				.stream().map(role->new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role" + authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(usuario.getEmail(), usuario.getPassword(), usuario.getEnable(), true, true, true, authorities);
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) {
		return authDao.findByUsername(username);
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findByEmail(String email) {
		return authDao.findByEmail(email);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		
		return authDao.save(usuario);
	}

	

}
