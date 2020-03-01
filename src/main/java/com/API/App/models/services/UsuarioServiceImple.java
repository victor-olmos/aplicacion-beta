package com.API.App.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.API.App.models.dao.IUsuarioDao;
import com.API.App.models.entity.Usuario;

@Service
public class UsuarioServiceImple implements IUserService {
	
	@Autowired
	private IUsuarioDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	
	public List<Usuario> findAll(){
		return (List<Usuario>) clienteDao.findAll();
	}
	

}
