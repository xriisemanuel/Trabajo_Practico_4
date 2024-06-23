package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Docente {
	private String legajo;
	private String name;
	private String lastname;
	private String email;
	private String phone;
	private boolean state;
	
	public Docente() {
	}

	public Docente(String legajo, String name, String lastname, String email, String phone, boolean state) {
		super();
		this.legajo = legajo;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.state = state;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
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

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
}
