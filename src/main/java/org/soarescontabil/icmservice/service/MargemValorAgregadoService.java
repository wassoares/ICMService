package org.soarescontabil.icmservice.service;

import java.util.Collection;

import org.soarescontabil.icmservice.model.MargemValorAgregado;
import org.soarescontabil.icmservice.repository.MargemValorAgregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MargemValorAgregadoService {

	@Autowired
	private MargemValorAgregadoRepository mvaRepository;

	public MargemValorAgregado salvar(MargemValorAgregado mva) {
		return mvaRepository.save(mva);		
	}

	public Collection<MargemValorAgregado> buscarTodos() {
		return mvaRepository.findAll();
	}
	
	public MargemValorAgregado buscarPorId(Integer id) {
		return mvaRepository.findOne(id);
	}
	
	public void excluir(MargemValorAgregado mva) {
		mvaRepository.delete(mva);
	}
	
	public MargemValorAgregado alterar(MargemValorAgregado mva) {
		return mvaRepository.save(mva);
	}
}
