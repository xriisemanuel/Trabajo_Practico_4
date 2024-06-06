package ar.edu.unju.fi.model;

public class Carrera {
	private int code;
	private String name;
	private int total_years;
	private boolean state;

	public Carrera() {
	}

	public Carrera(int code, String name, int total_years, boolean state) {
		super();
		this.code = code;
		this.name = name;
		this.total_years = total_years;
		this.state = state;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal_years() {
		return total_years;
	}

	public void setTotal_years(int total_years) {
		this.total_years = total_years;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}
