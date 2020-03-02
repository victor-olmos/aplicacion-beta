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

import com.API.App.models.dao.auth.ICuentaDao;
import com.API.App.models.entity.auth.Cuenta;

@Service
public class CuentaService implements ICuentaService , UserDetailsService {
	
	private Logger logger = LoggerFactory.getLogger(CuentaService.class);
	@Autowired
	private ICuentaDao cuentaDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Cuenta cuenta = cuentaDao.findByUsername(username);
		
		if (cuenta == null) {
			logger.error("Error: el correo: '"+username+"' no existe en los registros");
			throw new UsernameNotFoundException("Error: el correo: '"+username+"' no existe en los registros");
		}
		
		List<GrantedAuthority> authorities = cuenta.getRoles()
				.stream().map(role->new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role" + authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(cuenta.getEmail(), cuenta.getPassword(), cuenta.getEnable(), true, true, true, authorities);
	}

	@Override
	@Transactional(readOnly=true)
	public Cuenta findByUsername(String username) {
		
		return cuentaDao.findByUsername(username);
	}

	@Override
	@Transactional(readOnly=true)
	public Cuenta findByEmail(String email) {
		return cuentaDao.findByEmail(email);
	}

	@Override
	@Transactional
	public Cuenta save(Cuenta cuenta) {
		return cuentaDao.save(cuenta);
	}



}
