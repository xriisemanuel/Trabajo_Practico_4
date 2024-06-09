package ar.edu.unju.fi.model;

public class Materia {
	private Integer code;
	private String name;
	private String course;
	private Integer hours;
	private boolean modality;
	private String teacher_name;
	private String carrer;

	public Materia() {
	}

	public Materia(Integer code, String name, String course, Integer hours, boolean modality, String teacher_name,
			String carrer) {
		this.code = code;
		this.name = name;
		this.course = course;
		this.hours = hours;
		this.modality = modality;
		this.teacher_name = teacher_name;
		this.carrer = carrer;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
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

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getCarrer() {
		return carrer;
	}

	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}

}
