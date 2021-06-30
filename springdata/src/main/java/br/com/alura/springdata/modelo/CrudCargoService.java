package br.com.alura.springdata.modelo;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.springdata.repository.CargoRepository;

@Service
public class CrudCargoService {

	private CargoRepository cargoRepository;

	public CrudCargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public void inicial(Scanner sc) {
		salvar(sc);
	}

	public void salvar(Scanner sc) {
		System.out.println("Insira a Descrição Do Cargo:");
		sc.nextLine();
		String descricacao = sc.nextLine();
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricacao);
		cargoRepository.save(cargo);
		System.out.println("Cargo Salvo!");
	}
	
	public void atualizar(Scanner sc) {
		System.out.println("Insira o ID:");
		long id = sc.nextInt();
		System.out.println("Insira a Nova Descrição:");
		sc.nextLine();
		String descricacao = sc.nextLine();
		Cargo cargo = new Cargo();
		cargo.setId(id);
		cargo.setDescricao(descricacao);
		cargoRepository.save(cargo);
		System.out.println("Cargo Atualizado!");
		
	}

}
