package com.API.App.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;


import com.API.App.models.entity.Usuario;
import com.API.App.models.services.auth.IAuthService;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	
	@Autowired
	private IAuthService authService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Usuario usuario = authService.findByEmail(authentication.getName());
		System.out.println(usuario.getUsername());
		Map<String, Object> info = new HashMap<>();
		info.put("usuario", usuario.getUsername());
		info.put("email", usuario.getEmail());
		
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
