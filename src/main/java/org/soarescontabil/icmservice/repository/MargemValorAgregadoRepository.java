package org.soarescontabil.icmservice.repository;

import org.soarescontabil.icmservice.model.MargemValorAgregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MargemValorAgregadoRepository extends JpaRepository<MargemValorAgregado, Integer> {	
	
}
