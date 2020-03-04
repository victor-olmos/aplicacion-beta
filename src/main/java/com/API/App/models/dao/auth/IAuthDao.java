package com.API.App.models.dao.auth;

import org.springframework.data.repository.CrudRepository;

import com.API.App.models.entity.Usuario;


public interface IAuthDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
	
	public Usuario findByEmail(String email);
	
	
}
