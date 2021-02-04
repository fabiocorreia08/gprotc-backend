package br.gov.cmb.gproct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.gproct.model.Solicitante;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, Long>{
	
	

}
