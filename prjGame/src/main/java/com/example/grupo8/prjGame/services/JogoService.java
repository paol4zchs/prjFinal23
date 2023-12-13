package com.example.grupo8.prjGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grupo8.prjGame.entities.Jogo;
import com.example.grupo8.prjGame.repositories.JogoRepository;

@Service
public class JogoService {

	
	private final JogoRepository jogoRepository;

	@Autowired
	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}

	
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}

	
	public List<Jogo> getAllJogos() {
		return jogoRepository.findAll();
	}


	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}


	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}
	
}
