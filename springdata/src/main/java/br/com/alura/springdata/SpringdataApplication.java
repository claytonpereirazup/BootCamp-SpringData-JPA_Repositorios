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
			System.out.println("Qual açao você quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Cargo");
			
			int action = sc.nextInt();
			
			if (action == 1) {
				cargoService.inicial(sc);
			}
			
			system = false;
		}
		
		sc.close();
	}


}
