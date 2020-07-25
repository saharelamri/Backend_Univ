package com.sesame.Interface;

import java.util.Collection;

import com.sesame.DAO.Departement;

public interface DepartementInterface {
	public Collection<Departement> getAll();
	public Departement getId(Long id);
	public void Delete (Long id);
	public Departement Add(Departement c);
	public Departement Edit(Departement c);
	Boolean findId(Long id);
}
