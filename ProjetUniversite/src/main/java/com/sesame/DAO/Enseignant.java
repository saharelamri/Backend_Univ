package com.sesame.DAO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Collection;


@Entity
public class Enseignant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long matricule;
	private String nomENS;
	private String prenomENS;
	private String adresseENS;
	private String diplome;

	@ManyToOne
	@JoinColumn(name="codeDep")
	private Departement departement;

	@ManyToOne
	@JoinColumn(name="code_C")
	private Cour cours;

	@ManyToMany
	@JoinTable(name="etudiant_enseignant" ,joinColumns=@JoinColumn(name="enseignant_id"), inverseJoinColumns=@JoinColumn(name="etudiant_id"))
	private Collection <Etudiant> etudiants;
	
	
	public Enseignant() {}

	public Enseignant(Long matricule, String nomENS, String prenomENS, String adresseENS, String diplome,
			Departement departement) {
		super();
		this.matricule = matricule;
		this.nomENS = nomENS;
		this.prenomENS = prenomENS;
		this.adresseENS = adresseENS;
		this.diplome = diplome;
		this.departement = departement;
	}

	public Long getMatricule() {
		return matricule;
	}

	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}

	public String getNomENS() {
		return nomENS;
	}

	public void setNomENS(String nomENS) {
		this.nomENS = nomENS;
	}

	public String getPrenomENS() {
		return prenomENS;
	}

	public void setPrenomENS(String prenomENS) {
		this.prenomENS = prenomENS;
	}

	public String getAdresseENS() {
		return adresseENS;
	}

	public void setAdresseENS(String adresseENS) {
		this.adresseENS = adresseENS;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
	
	
	
	
	
	


}
