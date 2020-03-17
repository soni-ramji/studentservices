/**
 * 
 */
package com.ramji.capital.model;

/**
 * @author Ram Ji Soni
 *
 */
public class Student {

	private Long id;

	private String name;

	private String emailId;

	/**
	 * @return the id
	 */
	public final Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailId
	 */
	public final String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public final void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @param id
	 * @param name
	 * @param emailId
	 */
	public Student(Long id, String name, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}

}
