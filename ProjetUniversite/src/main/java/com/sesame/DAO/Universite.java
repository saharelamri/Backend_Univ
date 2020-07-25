package com.sesame.DAO;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Universite implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long codeUNV;
private String nomUNV;
private String adresseUNV;

@OneToMany(mappedBy="universite",fetch=FetchType.LAZY)
private Collection<Departement> Departements;
public Universite() {
	super();
}

public Universite(String nomUNV, String adresseUNV) {

	this.nomUNV = nomUNV;
	this.adresseUNV = adresseUNV;
}

public Universite(long id, String nomUNV, String adresseUNV) {
	this.codeUNV=id;
	this.nomUNV = nomUNV;
	this.adresseUNV = adresseUNV;
}

public Universite(long id) {
	// TODO Auto-generated constructor stub
	this.codeUNV=id;
}

public long getCodeUNV() {
	return codeUNV;
}

public void setCodeUNV(long codeUNV) {
	this.codeUNV = codeUNV;
}

public String getNomUNV() {
	return nomUNV;
}

public void setNomUNV(String nomUNV) {
	this.nomUNV = nomUNV;
}

public String getAdresseUNV() {
	return adresseUNV;
}

public void setAdresseUNV(String adresseUNV) {
	this.adresseUNV = adresseUNV;
}

public Collection<Departement> getDepartements() {
	return Departements;
}

public void setDepartements(Collection<Departement> departements) {
	Departements = departements;
}



}
