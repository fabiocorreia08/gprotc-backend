package br.gov.cmb.gproct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.gproct.model.Solicitante;
import br.gov.cmb.gproct.repository.SolicitanteRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SolicitanteController {

	@Autowired
	SolicitanteRepository solicitanteRepo;
	
	@GetMapping("/solicitantes")	
	public ResponseEntity<List<Solicitante>> lista() {
		return ResponseEntity.ok().body(solicitanteRepo.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Solicitante> buscaPorId(@PathVariable Long id) {
		return ResponseEntity.ok().body(solicitanteRepo.findById(id).get());
	}

}
