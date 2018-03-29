/**
 * 
 */
package jp.co.kaki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jp.co.kaki.App.Argument;
import jp.co.kaki.Interface.ArgumentResolver;
import jp.co.kaki.Interface.Calculator;

/**
 * @author 216412
 *
 */
@SpringBootApplication
public class BootDiApp implements CommandLineRunner{
	
	@Autowired
	ArgumentResolver argumentResolver;
	@Autowired
	Calculator calculator;

	@Override
	public void run(String...strings) throws Exception {
		System.out.print("Enter 2 numbers like '10 20' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("result=" + result);
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootDiApp.class, args);
	}
}
