package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Materia;

public class ListadoMaterias {
	// almacen de datos
	public static List<Materia> materias = new ArrayList<Materia>();

	// metodo para listar materias
	public static List<Materia> listarMaterias() {
		return materias;
	}

	// metodo para buscar una materia por codigo
	public static Materia buscarMateriaPorCodigo(Integer codigo) {
		for (Materia m : materias) {
			if (m.getCode().equals(codigo)) {
				return m;
			}
		}
		return null;
	}

	// Metodo para agregar materia
	public static void agregarMateria(Materia m) {
		materias.add(m);
	}

	// metodo para modificar la materia
	public static void modificarMateria(Materia materiaModificada) {
		for (int i = 0; i < materias.size(); i++) {
			Materia materia = materias.get(i);
			if (materia.getCode().equals(materiaModificada.getCode())) {
				materias.set(i, materiaModificada);
				break;
			}
		}
	}

	// metodo para eliminar la materia
	public static void eliminarMateria(String codigo) {
		materias.removeIf(carrera -> carrera.getCode().equals(codigo));
	}
}
