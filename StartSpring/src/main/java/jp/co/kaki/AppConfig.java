/**
 * 
 */
package jp.co.kaki;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.kaki.AddCalculator.AddCalculator;
import jp.co.kaki.Calculator.Calculator;

/**
 * @author 216412
 *
 */
@Configuration
public class AppConfig {
	@Bean
	Calculator calculator() {
		return new AddCalculator();
	}

}
