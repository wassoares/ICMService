package org.soarescontabil.service.repository;

import org.soarescontabil.service.model.MargemValorAgregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MargemValorAgregadoRepository extends JpaRepository<MargemValorAgregado, Integer> {	
	
}
