package com.sesame.DAO;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cour implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long codeC;
private String libelleC;

@OneToOne(fetch=FetchType.LAZY)
@JoinColumn(name="numS")
private Salle salle;

@OneToMany(mappedBy="cours")
private Collection<Enseignant> enseignant;

@ManyToMany(mappedBy="cours")
private Collection <Etudiant> etudiant;


public Cour(String libelleC) {
	super();
	this.libelleC = libelleC;
}
public Cour() {
	super();
}
public long getCodeC() {
	return codeC;
}
public void setCodeC(long codeC) {
	this.codeC = codeC;
}
public String getLibelleC() {
	return libelleC;
}
public void setLibelleC(String libelleC) {
	this.libelleC = libelleC;
}

}
