/**
 * File Name: Employee.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor<br>
 * Created: Nov 30, 2015
 */
package com.sqa.jf.employees;

/**
 * Employee //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class Employee extends AbstractPerson {

	public Employee(String name, String address, int age) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.setAge(age);
	}

	@Override
	public String toString() {
		return super.toString() + " They also work for a living.";
	}
}
