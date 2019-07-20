package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@SuppressWarnings("serial")
@Entity
public class Article implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String identifiant;
	private String designation_oper;
	private String unite;
	private String type;
	private double prix;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getDesignation_oper() {
		return designation_oper;
	}
	public void setDesignation_oper(String designation_oper) {
		this.designation_oper = designation_oper;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", identifiant=" + identifiant + ", designation_oper=" + designation_oper
				+ ", unite=" + unite + ", type=" + type + ", prix=" + prix + "]";
	}
	
	public Article() {
	}
	
	

}
