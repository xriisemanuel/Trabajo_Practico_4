package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;

public class ListadoDocentes {
	// almacen de datos
	public static List<Docente> docentes = new ArrayList<Docente>();

	// metodo para listar docentes
	public static List<Docente> listarDocentes() {
		return docentes;
	}

	// metodo para buscar docente por id
	public static Docente buscarDocentePorLegajo(String legajo) {
		for (Docente c : docentes) {
			if (c.getLegajo().equals(legajo)) {
				return c;
			}
		}
		return null;
	}

	// Metodo para agregar docente
	public static void agregarDocente(Docente d) {
		docentes.add(d);
	}

	// metodo para modificar docente
	public static void modificarDocente(Docente docenteModificado) {
		for (int i = 0; i < docentes.size(); i++) {
			Docente docente = docentes.get(i);
			if (docente.getLegajo().equals(docenteModificado.getLegajo())) {
				docentes.set(i, docenteModificado);
				break;
			}
		}
	}

	// metodo para eliminar docente
	public static void eliminarDocente(String legajo) {
		docentes.removeIf(carrera -> carrera.getLegajo().equals(legajo));
	}
}
