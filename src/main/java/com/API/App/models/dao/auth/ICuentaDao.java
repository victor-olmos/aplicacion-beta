package com.API.App.models.dao.auth;


import org.springframework.data.repository.CrudRepository;

import com.API.App.models.entity.auth.Cuenta;

public interface ICuentaDao extends CrudRepository<Cuenta, Long> {
	
	public Cuenta findByUsername(String username);
	
	public Cuenta findByEmail(String email);
	
	//////////////////CAMBIAR POR EMAIL ///////////////////////////////
	
	
	

}
