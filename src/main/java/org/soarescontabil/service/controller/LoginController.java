package org.soarescontabil.service.controller;

import java.util.Date;

import javax.servlet.ServletException;

import org.soarescontabil.service.model.Usuario;
import org.soarescontabil.service.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/autenticar", consumes=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public LoginResponse autenticar(@RequestBody Usuario usuario) throws ServletException {
		
		if (usuario.getLogin() == null || usuario.getSenha() == null) {
			throw new ServletException("Login e Senha obrigatório.");
		}
		
		Usuario usuarioRegistrado = usuarioService.buscarPorLogin(usuario.getLogin());

		if (usuarioRegistrado == null) {
			throw new ServletException("Usuário não encontrado.");
		}
		
		if (!usuarioRegistrado.getSenha().equals(usuario.getSenha())) {
			throw new ServletException("Usuário ou senha inválido.");
		}
		
		String token = Jwts.builder()
				.setSubject(usuarioRegistrado.getLogin())
				.signWith(SignatureAlgorithm.HS512, "wassoares")
				.setExpiration(new Date(System.currentTimeMillis() + 5 * 60 * 1000))
				.compact();
		
		return new LoginResponse(token);		
	}
	
	private class LoginResponse {
		
		private String token;
		
		public LoginResponse(String token) {
			this.token = token;
		}

		@SuppressWarnings("unused")
		public String getToken() {
			return token;
		}		
		
	}
	
}
