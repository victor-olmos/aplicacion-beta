package com.API.App.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.API.App.models.entity.auth.Cuenta;
import com.API.App.models.services.auth.ICuentaService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {
	@Autowired
	private ICuentaService cuentaService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		
		Cuenta cuenta = cuentaService.findByEmail(authentication.getName());
		System.out.println(cuenta);
		System.out.println(authentication);
		Map<String, Object> info = new HashMap<>();
		info.put("agregando el username al token", cuenta.getUsername());
		info.put("agregando el email al token:", cuenta.getEmail());
		
	
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
