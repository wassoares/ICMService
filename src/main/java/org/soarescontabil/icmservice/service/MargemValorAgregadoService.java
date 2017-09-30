package org.soarescontabil.icmservice.service;

import java.util.Collection;

import org.soarescontabil.icmservice.model.MargemValorAgregado;
import org.soarescontabil.icmservice.repository.MargemValorAgregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MargemValorAgregadoService {

	@Autowired
	private MargemValorAgregadoRepository margemRepository;

	public MargemValorAgregado salvar(MargemValorAgregado margem) {
		return margemRepository.save(margem);		
	}

	public Collection<MargemValorAgregado> buscarTodos() {
		return margemRepository.findAll();
	}
	
	public MargemValorAgregado buscarPorId(Integer id) {
		return margemRepository.findOne(id);
	}
	
	public void excluir(MargemValorAgregado margem) {
		margemRepository.delete(margem);
	}
	
	public MargemValorAgregado alterar(MargemValorAgregado margem) {
		return margemRepository.save(margem);
	}
}
