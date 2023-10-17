package br.com.fiap.megafarma.model.repository;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.fiap.megafarma.model.entity.Remedio;

public class RemedioRepository {

	public static ArrayList<Remedio> findAll(){
		ArrayList<Remedio> remedios = new ArrayList<Remedio>();
		
		Remedio remedio1 = new Remedio();
		remedio1.setId(1L);
		remedio1.setNome("Loratadina");
		remedio1.setPreco(7.93);
		remedio1.setDataDeFabricacao(LocalDate.now());
		remedio1.setDataDeValidade(LocalDate.now().plusYears(2)); 
		
		remedios.add(remedio1);
		
		Remedio remedio2 = new Remedio(2L, "Amoxicilina", 26.36, LocalDate.now(), LocalDate.now().plusYears(1));
		
		remedios.add(remedio2);
		
		return remedios;
	}
}
