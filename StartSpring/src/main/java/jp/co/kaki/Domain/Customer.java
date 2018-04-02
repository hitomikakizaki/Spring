/**
 * 
 */
package jp.co.kaki.Domain;

import java.io.Serializable;

/**
 * @author kakizakihitomi
 *
 */
public class Customer implements Serializable {
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Customer(int i, String string, String string2) {
		super();
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String firstName;
	private String lastName;
	
	

}
