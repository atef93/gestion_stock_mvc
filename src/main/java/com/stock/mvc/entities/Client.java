package com.stock.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{

	
	@Id
	@GeneratedValue
	private Long idClient;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String photo;
	
	private String email;

	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;
	
	public Client() {
		super();
	}
	
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long id) {
		this.idClient = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<CommandeClient> getCommandeClients() {
		return commandeClients;
	}

	public void setCommandeClients(List<CommandeClient> commandeClients) {
		this.commandeClients = commandeClients;
	}
	
	
	
	
}
