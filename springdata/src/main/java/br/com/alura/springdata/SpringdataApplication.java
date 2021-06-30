package br.com.alura.springdata;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.modelo.CrudCargoService;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {
	
	//METODO PADRAO DE INICIALIZACAO
	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	//METODOS DE TESTE DE INJECAO E CRUD
	
	private final CrudCargoService cargoService;
	
	public SpringdataApplication(CrudCargoService cargoService) {
		this.cargoService = cargoService;
	}
	
	
	
	private boolean system = true;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		while (system) {
			System.out.println("Qual ação você quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Salvar");
			System.out.println("2 - Atualizar");
			
			int action = sc.nextInt();
			
			switch (action) {
			case 0:
				system = false;
				break;
			case 1:
				cargoService.salvar(sc);
				break;
			case 2:
				cargoService.atualizar(sc);
				break;

			default:
				system = false;
			}
		}
		
		sc.close();
	}


}
