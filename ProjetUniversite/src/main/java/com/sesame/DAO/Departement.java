package com.sesame.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.sesame.DAO.Universite;

@Entity
public class Departement implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codeDEP;
	private String nomDEP;
	
	@ManyToOne
	@JoinColumn(name="codeU")
	private Universite universite;
	
	
	public Departement(long codeDEP, String nomDEP) {
		super();
		this.codeDEP = codeDEP;
		this.nomDEP = nomDEP;
	}
	public Departement(String nomDEP) {
		super();
		this.nomDEP = nomDEP;
	}
	public Departement() {
		super();
	}
	public long getCodeDEP() {
		return codeDEP;
	}
	public void setCodeDEP(long codeDEP) {
		this.codeDEP = codeDEP;
	}
	public String getNomDEP() {
		return nomDEP;
	}
	public void setNomDEP(String nomDEP) {
		this.nomDEP = nomDEP;
	}
	
	
}
