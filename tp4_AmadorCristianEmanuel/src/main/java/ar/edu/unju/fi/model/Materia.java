package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	private String code;
	private String name;
	private String course;
	private Integer hours;
	private boolean modality;
	private Docente teacher_name;
	private Carrera carrer;
	private Boolean state;

	public Materia() {
	}

	public Materia(String code, String name, String course, Integer hours, boolean modality, Docente teacher_name,
			Carrera carrer, Boolean state) {
		super();
		this.code = code;
		this.name = name;
		this.course = course;
		this.hours = hours;
		this.modality = modality;
		this.teacher_name = teacher_name;
		this.carrer = carrer;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public boolean isModality() {
		return modality;
	}

	public void setModality(boolean modality) {
		this.modality = modality;
	}

	public Docente getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(Docente teacher_name) {
		this.teacher_name = teacher_name;
	}

	public Carrera getCarrer() {
		return carrer;
	}

	public void setCarrer(Carrera carrer) {
		this.carrer = carrer;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}
}
