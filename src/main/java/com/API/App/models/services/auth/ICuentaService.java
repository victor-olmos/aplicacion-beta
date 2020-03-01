package com.API.App.models.services.auth;

import com.API.App.models.entity.auth.Cuenta;

public interface ICuentaService {

	public Cuenta findByUsername(String username);
	
	public Cuenta findByEmail(String email);
}
