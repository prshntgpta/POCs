/**
 * 
 */
package org.prshntgpta.jaxrsapp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Prashant Gupta
 *
 */

@XmlRootElement
public class Record {

	private Integer id;
	private String name;
	private String company;

	/**
	 * 
	 */
	public Record() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Record [id=" + id + ", name=" + name + ", company=" + company + "]";
	}

	/**
	 * @param id
	 * @param name
	 * @param company
	 */
	public Record(Integer id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}

	/**
	 * @return the id
	 */
	@XmlElement
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@javax.xml.bind.annotation.XmlElement
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

}
