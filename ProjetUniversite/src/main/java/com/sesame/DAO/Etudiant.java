package com.sesame.DAO;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Etudiant implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long numInscription;
	private String nomETU;
	private String prenomETU;
	private String adresseETU;
	private Date dateEntre;
	
	@ManyToMany(mappedBy="etudiants")
	private Collection <Enseignant> enseignants;
	
	@ManyToMany
	@JoinTable(name="etudiant_cours" ,joinColumns=@JoinColumn(name="etudiant_id"), inverseJoinColumns=@JoinColumn(name="cour_id"))
	private Collection <Cour> cours;
	
	public Etudiant(String nomETU, String prenomETU, String adresseETU, Date dateEntre) {
		
		this.nomETU = nomETU;
		this.prenomETU = prenomETU;
		this.adresseETU = adresseETU;
		this.dateEntre = dateEntre;
	}
	public Etudiant() {
		super();
	}
	public long getNumInscription() {
		return numInscription;
	}
	public void setNumInscription(long numInscription) {
		this.numInscription = numInscription;
	}
	public String getNomETU() {
		return nomETU;
	}
	public void setNomETU(String nomETU) {
		this.nomETU = nomETU;
	}
	public String getPrenomETU() {
		return prenomETU;
	}
	public void setPrenomETU(String prenomETU) {
		this.prenomETU = prenomETU;
	}
	public String getAdresseETU() {
		return adresseETU;
	}
	public void setAdresseETU(String adresseETU) {
		this.adresseETU = adresseETU;
	}
	public Date getDateEntre() {
		return dateEntre;
	}
	public void setDateEntre(Date dateEntre) {
		this.dateEntre = dateEntre;
	}
}
