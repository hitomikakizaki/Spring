/**
 * 
 */
package jp.co.kaki.App;

import org.springframework.stereotype.Component;

import jp.co.kaki.Interface.Calculator;

/**
 * @author 216412
 *
 */
@Component
public class AddCalculator implements Calculator {
	@Override
	public int calc(int a, int b) {
		return a + b;
	}
}
