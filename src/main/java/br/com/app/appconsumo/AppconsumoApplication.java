package br.com.app.appconsumo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppconsumoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppconsumoApplication.class, args);
	}
	
	/*testar
	@Bean
	public CommandLineRunner run(EnderecoService service) throws Exception{
		
		System.out.println("Endereço: "+service.obterPorCep("1234"));
		
		return null;
	}
	*/

}
