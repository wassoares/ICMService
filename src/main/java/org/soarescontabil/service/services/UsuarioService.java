package org.soarescontabil.service.services;

import java.util.Collection;

import org.soarescontabil.service.model.Usuario;
import org.soarescontabil.service.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);		
	}
	
	public Usuario buscarPorId(Integer id) {
		return usuarioRepository.findOne(id);
	}
	
	public Usuario buscarPorLogin(String login) {
		return usuarioRepository.buscarPorLogin(login);
	}

	public Collection<Usuario> buscarTodos() {
		return usuarioRepository.findAll();
	}
	
	public void excluir(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	//método não utilizado! verificar necessidade de mantê-lo
	public Usuario alterar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
