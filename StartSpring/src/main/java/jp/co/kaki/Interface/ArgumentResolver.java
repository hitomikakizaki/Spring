/**
 * 
 */
package jp.co.kaki.Interface;

import java.io.InputStream;

import jp.co.kaki.App.Argument;


/**
 * @author 216412
 *
 */
public interface ArgumentResolver {
	Argument resolve(InputStream stream);

}
