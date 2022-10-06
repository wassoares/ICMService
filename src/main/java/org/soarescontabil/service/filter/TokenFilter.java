package org.soarescontabil.service.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Jwts;

public class TokenFilter extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest hsr = (HttpServletRequest) request;
		String tag = hsr.getHeader("Authorization");
		
		if (tag == null || !tag.startsWith("Bearer ")) {
			throw new ServletException("Token inexistente ou inválido.");
		}
		
		String token = tag.substring(7); //Extração apenas do token sem "Bearer "
		
		//verificar se o token é válido
		try {
			Jwts.parser().setSigningKey("wassoares").parseClaimsJws(token).getBody();
		} catch (Exception e) {
			((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED, "Token inválido.");
			//throw new ServletException("Token inválido.");
		}
		
		chain.doFilter(request, response);		
	}

}
