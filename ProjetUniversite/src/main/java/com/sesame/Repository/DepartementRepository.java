package com.sesame.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.DAO.Departement;
import com.sesame.DAO.Universite;

public interface DepartementRepository  extends JpaRepository<Departement,Long> {

	public List<Departement> findByCodeDEP(long id);
	public List<Departement> findByNomDEP(String ch);
	public List<Departement> findByUniversiteNomUNV(String ch);

	public Page<Departement> findByNomDEP(String ch,Pageable pageable);
	
	public List<Departement> findByNomDEPContaining(String ch);//%like selon un caraceree  donnée
}
