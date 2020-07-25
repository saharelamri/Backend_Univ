package com.sesame.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.DAO.Cour;
import com.sesame.DAO.Universite;

public interface CourRepository  extends JpaRepository<Cour,Long> {

	public List<Cour> findByLibelleC(String ch);
	public List<Cour> findByCodeC(Long id);
	public List<Cour> findByEtudiantNomETU(String ch);
	public List<Cour> findByEnseignantNomENS(String ch);

	public Page<Cour> findByLibelleC(String ch,Pageable pageable);
	
	public List<Cour> findByLibelleCContaining(String ch);//%like selon un caraceree  donnée
}
