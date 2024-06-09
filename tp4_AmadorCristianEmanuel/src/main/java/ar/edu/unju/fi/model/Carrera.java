package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Carrera {
	private String code;
	private String name;
	private Integer total_years;
	private boolean state;

	public Carrera() {
	}

	public Carrera(String code, String name, Integer total_years, boolean state) {
		this.code = code;
		this.name = name;
		this.total_years = total_years;
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotal_years() {
		return total_years;
	}

	public void setTotal_years(Integer total_years) {
		this.total_years = total_years;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}
