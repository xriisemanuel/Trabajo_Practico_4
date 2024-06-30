package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class ListadoAlumnos {
	// almacen de datos
	public static List<Alumno> alumnos = new ArrayList<Alumno>();

	// metodo para listar carreras
	public static List<Alumno> listarAlumnos() {
		List<Alumno> x = new ArrayList<Alumno>();
		for (int i =0; i < alumnos.size(); i++) {
			Alumno alumno = alumnos.get(i);
			if (alumno.getState().equals(true)) {
				x.add(alumno);
			}
		}
		return x;
	}

	// metodo para buscar alumno por id
	public static Alumno buscarAlumnoPorID(String id) {
		Alumno buscado = null;
		for (int i=0; i < alumnos.size(); i ++) {
			buscado = alumnos.get(i);
			if (buscado.getId().equals(id))
				break;
		}
		return buscado;
	}

	// Metodo para agregar alumno
	public static void agregarAlumno(Alumno a) {
		a.setState(true);
		alumnos.add(a);
	}

	// metodo para modificar alumno
	public static void modificarAlumno(Alumno alumnoModificado) {
		
		
		Iterator<Alumno> alumnosIterator = alumnos.iterator();
		boolean encontrado = false;
		while (alumnosIterator.hasNext() && !encontrado) {
			Alumno alumno = alumnosIterator.next();
			if (alumno.getId().equals(alumnoModificado.getId())) {
				alumno.setName(alumnoModificado.getName());
				alumno.setLastname(alumnoModificado.getLastname());
				alumno.setId(alumnoModificado.getId());
				alumno.setAddress(alumnoModificado.getAddress());
				alumno.setDatebirth(alumnoModificado.getDatebirth());
				alumno.setEmail(alumnoModificado.getEmail());
				alumno.setLu(alumnoModificado.getLu());
				alumno.setPhone(alumnoModificado.getPhone());
				alumno.setState(true);
				encontrado = true;
			}
		
		}
//		for (int i = 0; i < alumnos.size(); i++) {
//			Alumno alumno = alumnos.get(i);
//			if (alumno.getId().equals(alumnoModificado.getId())) {
//				alumnoModificado.setState(true);
//				alumnos.set(i, alumnoModificado);
//				break;
//			}
//		}
	}

	// metodo para eliminar alumno
	public static void eliminarAlumno(String id) {
		//alumnos.removeIf(alumno -> alumno.getId().equals(id));
		for(int i=0; i < alumnos.size(); i ++) {
			Alumno alumno = alumnos.get(i);
			
			if (alumno.getId().equals(id)) {
				alumno.setState(false);
				break;
			}
		}
	}
}
