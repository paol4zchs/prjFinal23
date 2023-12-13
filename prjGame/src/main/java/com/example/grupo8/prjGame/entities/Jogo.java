package com.example.grupo8.prjGame.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String genero;
	private String descrição;
	private String squad;
	private String integrantes;
	private String plataform;	
	private String url;	
	private String thumbnailpath;
  
public Jogo() {
    	
  }   
	public Jogo(Long id, String name, String genero, String descrição, String squad, String integrantes, String plataform, String url, String thumbnailpath) {
		super();
		this.id = id;
		this.name = name;
		this.descrição=descrição;
		this.squad = squad;
		this.integrantes = integrantes;
		this.plataform = plataform;
		this.url = url;
		this.thumbnailpath = thumbnailpath;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getSquad() {
		return squad;
	}
	public void setSquad(String squad) {
		this.squad = squad;
	}
	public String getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}
	public String getPlataform() {
		return plataform;
	}
	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getThumbnailpath() {
		return thumbnailpath;
	}
	public void setThumbnailpath(String thumbnailpath) {
		this.thumbnailpath = thumbnailpath;
	}
	
	
}
