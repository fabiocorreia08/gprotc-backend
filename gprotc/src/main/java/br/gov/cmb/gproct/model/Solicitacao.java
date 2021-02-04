package br.gov.cmb.gproct.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SOLICITACAO")
public class Solicitacao {
	
	@Id
	@Column(name="ID_SOLICITACAO" ,length=100)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	@Column(name="NR_PROTC" ,length=100)
	private String protocolo;
    @Column(name="CD_UNID" ,length=100)
    private String unidade;
    @Column(name="CD_UNID_ATEND" ,length=100)
    private String unidadeAtendimento;
    @Column(name="CD_USUAR" ,length=100)
    private String usuario;
    @Column(name="IN_EXCED" ,length=100)
    private String exced;
    @Column(name="CD_TP_DOC" ,length=100)
    private String tipoDocumento;
    @Column(name="NM_IDENT_PRIMAR" ,length=100)
    private Integer identidadePrimaria;
    @Column(name="NM_IDENT_SECND" ,length=100)
    private Integer identidadeSecundaria;
    @Column(name="TX_SOBREN" ,length=100)
    private String sobrenome;
    @Column(name="TX_NOME" ,length=100)
    private String nome;
    @Column(name="DS_NACION" ,length=100)
    private String nacionalidade;
    @Column(name="SX_NOME" ,length=100)
    private String sexo;
    @Column(name="DS_NATURL" ,length=100)
    private String naturalidade;
    @Column(name="DT_EXP" ,length=100)
    private Date expedicao;
    @Column(name="DT_VALID" ,length=100)
    private Date validade;
    @Column(name="TX_LOCAL_EXP" ,length=100)
    private String localExpedicao;
    @Column(name="IM_FOTO1" ,length=100)
    private String foto1;
    @Column(name="IM_FOTO2" ,length=100)
    private String foto2;
    @Column(name="DS_DIGITAL_01_MAO" ,length=100)
    private String digital01Mao;
    @Column(name="DS_DIGITAL_01_DEDO" ,length=100)
    private String digital01Dedo;
    @Column(name="IM_DIGITAL_01_IMAGEM" ,length=100)
    private String digital01Imagem;
    @Column(name="DS_DIGITAL_02_MAO" ,length=100)
    private String digital02Mao;
    @Column(name="DS_DIGITAL_02_DEDO" ,length=100)
    private String digital02Dedo;
    @Column(name="IM_DIGITAL_02_IMAGEM" ,length=100)
    private String digital02Imagem;
    @Column(name="TP_NATURZ_ENTRG" ,length=100)
    private String naturezaEntrega;
    @Column(name="CD_STATUS_SOLIC" ,length=100)
    private String statusSolicitacao;
    @Column(name="CD_ARQ" ,length=100)
    private String arquivo;
    @Column(name="CD_LOTE" ,length=100)
    private String loto;
    @Column(name="CD_PAUTA" ,length=100)
    private String pauta;
    @Column(name="DT_MAX_SAIDA" ,length=100)
    private Date maximaSaida;
    @Column(name="DT_NASC" ,length=100)
    private Date nascimento;
    @Column(name="NR_REMES" ,length=100)
    private Integer remessa;
    @Column(name="CD_PAIS" ,length=100)
    private String pais;
    @Column(name="NR_IDENT_CDADAO" ,length=100)
    private Integer identidadeCidadao;
    @Column(name="NR_CADERN" ,length=100)
    private Integer caderneta;
    @Column(name="CD_ESTAC" ,length=100)
    private String estac;
    @Column(name="TX_FILIACAO_L1" ,length=100)
    private String filiacaoL1;
    @Column(name="TX_FILIACAO_L2" ,length=100)
    private String filiacaoL2;
    @Column(name="TX_FILIACAO_L3" ,length=100)
    private String filiacaoL3;
    @Column(name="TX_FILIACAO_L4" ,length=100)
    private String filiacaoL4;
    @Column(name="TX_AUTORIZ_VIAGEM_L1" ,length=100)
    private String autorizacaoViagemL1;
    @Column(name="TX_AUTORIZ_VIAGEM_L2" ,length=100)
    private String autorizacaoViagemL2;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getUnidadeAtendimento() {
		return unidadeAtendimento;
	}
	public void setUnidadeAtendimento(String unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getExced() {
		return exced;
	}
	public void setExced(String exced) {
		this.exced = exced;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getIdentidadePrimaria() {
		return identidadePrimaria;
	}
	public void setIdentidadePrimaria(Integer identidadePrimaria) {
		this.identidadePrimaria = identidadePrimaria;
	}
	public Integer getIdentidadeSecundaria() {
		return identidadeSecundaria;
	}
	public void setIdentidadeSecundaria(Integer identidadeSecundaria) {
		this.identidadeSecundaria = identidadeSecundaria;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public Date getExpedicao() {
		return expedicao;
	}
	public void setExpedicao(Date expedicao) {
		this.expedicao = expedicao;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public String getLocalExpedicao() {
		return localExpedicao;
	}
	public void setLocalExpedicao(String localExpedicao) {
		this.localExpedicao = localExpedicao;
	}
	public String getFoto1() {
		return foto1;
	}
	public void setFoto1(String foto1) {
		this.foto1 = foto1;
	}
	public String getFoto2() {
		return foto2;
	}
	public void setFoto2(String foto2) {
		this.foto2 = foto2;
	}
	public String getDigital01Mao() {
		return digital01Mao;
	}
	public void setDigital01Mao(String digital01Mao) {
		this.digital01Mao = digital01Mao;
	}
	public String getDigital01Dedo() {
		return digital01Dedo;
	}
	public void setDigital01Dedo(String digital01Dedo) {
		this.digital01Dedo = digital01Dedo;
	}
	public String getDigital01Imagem() {
		return digital01Imagem;
	}
	public void setDigital01Imagem(String digital01Imagem) {
		this.digital01Imagem = digital01Imagem;
	}
	public String getDigital02Mao() {
		return digital02Mao;
	}
	public void setDigital02Mao(String digital02Mao) {
		this.digital02Mao = digital02Mao;
	}
	public String getDigital02Dedo() {
		return digital02Dedo;
	}
	public void setDigital02Dedo(String digital02Dedo) {
		this.digital02Dedo = digital02Dedo;
	}
	public String getDigital02Imagem() {
		return digital02Imagem;
	}
	public void setDigital02Imagem(String digital02Imagem) {
		this.digital02Imagem = digital02Imagem;
	}
	public String getNaturezaEntrega() {
		return naturezaEntrega;
	}
	public void setNaturezaEntrega(String naturezaEntrega) {
		this.naturezaEntrega = naturezaEntrega;
	}
	public String getStatusSolicitacao() {
		return statusSolicitacao;
	}
	public void setStatusSolicitacao(String statusSolicitacao) {
		this.statusSolicitacao = statusSolicitacao;
	}
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public String getLoto() {
		return loto;
	}
	public void setLoto(String loto) {
		this.loto = loto;
	}
	public String getPauta() {
		return pauta;
	}
	public void setPauta(String pauta) {
		this.pauta = pauta;
	}
	public Date getMaximaSaida() {
		return maximaSaida;
	}
	public void setMaximaSaida(Date maximaSaida) {
		this.maximaSaida = maximaSaida;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Integer getRemessa() {
		return remessa;
	}
	public void setRemessa(Integer remessa) {
		this.remessa = remessa;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Integer getIdentidadeCidadao() {
		return identidadeCidadao;
	}
	public void setIdentidadeCidadao(Integer identidadeCidadao) {
		this.identidadeCidadao = identidadeCidadao;
	}
	public Integer getCaderneta() {
		return caderneta;
	}
	public void setCaderneta(Integer caderneta) {
		this.caderneta = caderneta;
	}
	public String getEstac() {
		return estac;
	}
	public void setEstac(String estac) {
		this.estac = estac;
	}
	public String getFiliacaoL1() {
		return filiacaoL1;
	}
	public void setFiliacaoL1(String filiacaoL1) {
		this.filiacaoL1 = filiacaoL1;
	}
	public String getFiliacaoL2() {
		return filiacaoL2;
	}
	public void setFiliacaoL2(String filiacaoL2) {
		this.filiacaoL2 = filiacaoL2;
	}
	public String getFiliacaoL3() {
		return filiacaoL3;
	}
	public void setFiliacaoL3(String filiacaoL3) {
		this.filiacaoL3 = filiacaoL3;
	}
	public String getFiliacaoL4() {
		return filiacaoL4;
	}
	public void setFiliacaoL4(String filiacaoL4) {
		this.filiacaoL4 = filiacaoL4;
	}
	public String getAutorizacaoViagemL1() {
		return autorizacaoViagemL1;
	}
	public void setAutorizacaoViagemL1(String autorizacaoViagemL1) {
		this.autorizacaoViagemL1 = autorizacaoViagemL1;
	}
	public String getAutorizacaoViagemL2() {
		return autorizacaoViagemL2;
	}
	public void setAutorizacaoViagemL2(String autorizacaoViagemL2) {
		this.autorizacaoViagemL2 = autorizacaoViagemL2;
	}    

}
