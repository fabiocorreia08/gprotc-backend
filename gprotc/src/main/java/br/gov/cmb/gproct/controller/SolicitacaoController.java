package br.gov.cmb.gproct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.gproct.model.Solicitacao;
import br.gov.cmb.gproct.repository.SolicitacaoRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SolicitacaoController {

	@Autowired
	SolicitacaoRepository solicitacaoRepo;

	@GetMapping("/solicitacoes")	
	public List<Solicitacao> getAll() {
		return solicitacaoRepo.findAll();
	}
	
	@PostMapping("/solicitacoes")
	public List<Solicitacao> createSoliciatacoes(@RequestBody List<Solicitacao> solicitacoes) {	
			int count = 1;
		for (Solicitacao solicitacao : solicitacoes) {			
			String numeroProtocolo = "12000000000000"+count;
			String codUsuario = "26";
			String codUnidade = "374";
			solicitacao.setProtocolo(numeroProtocolo);
			solicitacao.setUsuario(codUsuario);
			solicitacao.setUnidade(codUnidade);
			count ++;						
		}		
		
		return solicitacaoRepo.saveAll(solicitacoes);
	}
	
	public void gerarProtocolo(){
		
	}
	
	@DeleteMapping("/solicitacoes")
	public void deleteSoliciatacoes() {		
		solicitacaoRepo.deleteAll();
	}	
	
}
