package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component

public class Alumno {
	private String id;
	private String name;
	private String lastname;
	private String email;
	private String phone;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate datebirth;
	private String address;
	private String lu;
	private Boolean state;

	public Alumno() {
	}

	public Alumno(String id, String name, String lastname, String email, String phone, LocalDate datebirth,
			String address, String lu, Boolean state) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.datebirth = datebirth;
		this.address = address;
		this.lu = lu;
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public LocalDate getDatebirth() {
		return datebirth;
	}

	public void setDatebirth(LocalDate datebirth) {
		this.datebirth = datebirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLu() {
		return lu;
	}

	public void setLu(String lu) {
		this.lu = lu;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}
	
}
