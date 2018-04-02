/**
 * 
 */
package jp.co.kaki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jp.co.kaki.Domain.Customer;
import jp.co.kaki.Service.CustomerService;

/**
 * @author kakizakihitomi
 *
 */

@SpringBootApplication
public class BootApp implements CommandLineRunner {
	@Autowired
	CustomerService customerService;
	
	@Override
	public void run(String...strings) throws Exception {
		customerService.save(new Customer(1, "Nobita", "Nobi"));
		customerService.save(new Customer(2, "Takeshi", "Goda"));
		customerService.save(new Customer(1, "Suneo", "Hanekawa"));
		
		customerService.findAll().forEach(System.out::println);
	}
	
	public static void main(String args) {
		SpringApplication.run(BootApp.class, args);
	}
}
