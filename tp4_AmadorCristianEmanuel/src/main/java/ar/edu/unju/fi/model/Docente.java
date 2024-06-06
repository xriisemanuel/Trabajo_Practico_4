package ar.edu.unju.fi.model;

public class Docente {
	private int legajo;
	private String name;
	private String lastname;
	private String email;
	private String phone;

	public Docente() {
	}

	public Docente(int legajo, String name, String lastname, String email, String phone) {
		super();
		this.legajo = legajo;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
