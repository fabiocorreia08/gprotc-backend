package br.gov.cmb.gproct.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.gov.cmb.gproct.model.Solicitacao;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long>{
	
	@Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "insert into CPD_SOLIC (NR_PROTC, CD_UNID) "
            + "VALUES (?1, ?2)", nativeQuery = true)
    public void insertSolicitacao(@Param("sp") Solicitacao s);
	
	 @Modifying
	 @Query(value = "insert into Logger (redirect,user_id) VALUES (:insertLink,:id)", nativeQuery = true)
	 @Transactional
	 void insert(@Param("insertLink") String insertLink, @Param("id") Long id);
	 
	 @Modifying
	 @Query(value = "insert into Logger (redirect,user_id) VALUES (:insertLink,:id)", nativeQuery = true)
	 @Transactional
	 void delete(@Param("insertLink") String insertLink, @Param("id") Long id);

}
