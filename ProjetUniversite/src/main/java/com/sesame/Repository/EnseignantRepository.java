package com.sesame.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.DAO.Enseignant;
import com.sesame.DAO.Universite;

public interface EnseignantRepository  extends JpaRepository<Enseignant,Long> {

	public List<Enseignant> findByMatricule(Long id);
	public List<Enseignant> findByNomENS(String ch);
	public List<Enseignant> findByPrenomENS(String ch);
	public List<Enseignant> findByCoursLibelleC(String ch);
	public List<Enseignant> findByDepartementNomDEP(String ch);

	public Page<Enseignant> findByNomENS(String ch,Pageable pageable);
	
	public List<Enseignant> findByNomENSContaining(String ch);//%like selon un caraceree  donnée
	
}
