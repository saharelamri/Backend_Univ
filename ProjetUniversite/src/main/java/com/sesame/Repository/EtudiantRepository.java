package com.sesame.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.DAO.Etudiant;
import com.sesame.DAO.Universite;

public interface EtudiantRepository  extends JpaRepository<Etudiant,Long>{

	public List<Etudiant> findByNumInscription(long id);
	public List<Etudiant> findByNomETU(String ch);
	public List<Etudiant> findByPrenomETU(String ch);
	public List<Etudiant> findByCoursLibelleC(String ch);

	public Page<Etudiant> findByNomETU(String ch,Pageable pageable);
	
	public List<Etudiant> findByNomETUContaining(String ch);//%like selon un caraceree  donnée
	
	
}
