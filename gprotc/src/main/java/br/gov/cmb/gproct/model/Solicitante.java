package br.gov.cmb.gproct.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SOLICITANTE")
public class Solicitante {
	
	@Id
	@Column(name="ID_SOLICITANTE" ,length=100)
	private Long id;	
	@Column(name="TX_NOME" ,length=100)
	private String nome;
	@Column(name="TX_SOBREN" ,length=100)
	private String sobrenome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
