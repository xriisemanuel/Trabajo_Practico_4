package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class ListadoAlumnos {
	// almacen de datos
	public static List<Alumno> alumnos = new ArrayList<Alumno>();

	// metodo para listar carreras
	public static List<Alumno> listarAlumnos() {
		return alumnos;
	}

	// metodo para buscar alumno por id
	public static Alumno buscarAlumnoPorID(String id) {
		for (Alumno c : alumnos) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	// Metodo para agregar alumno
	public static void agregarCarrera(Alumno a) {
		alumnos.add(a);
	}

	// metodo para modificar alumno
	public static void modificarAlumno(Alumno alumnoModificado) {
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno alumno = alumnos.get(i);
			if (alumno.getId().equals(alumnoModificado.getId())) {
				alumnos.set(i, alumnoModificado);
				break;
			}
		}
	}

	// metodo para eliminar alumno
	public static void eliminarAlumno(String id) {
		alumnos.removeIf(alumno -> alumno.getId().equals(id));
	}
}
