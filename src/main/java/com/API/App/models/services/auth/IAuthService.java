package com.API.App.models.services.auth;

import com.API.App.models.entity.Usuario;

public interface IAuthService {

	public Usuario findByUsername(String username);
	
	public Usuario findByEmail(String email);
	public Usuario save(Usuario usuario);

	
}
