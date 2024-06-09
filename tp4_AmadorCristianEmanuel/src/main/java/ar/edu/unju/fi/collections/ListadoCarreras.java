package ar.edu.unju.fi.collections;

import ar.edu.unju.fi.model.Carrera;
import java.util.ArrayList;
import java.util.List;

public class ListadoCarreras {
	// almacen de datos
	public static List<Carrera> carreras = new ArrayList<Carrera>();

	// metodo para listar carreras
	public static List<Carrera> listarCarreras() {
		List<Carrera> aux = new ArrayList<>();
		for (int i = 0; i < carreras.size(); i++) {
			Carrera carrera = carreras.get(i);
			if (carrera.isState()) {
				aux.add(carrera);
			}
		}
		//return carreras;
		return aux;
	}

	// metodo para buscar una carrera por id
	public static Carrera buscarCarreraPorCodigo(String codigo) {
		for (Carrera c : carreras) {
			if (c.getCode().equals(codigo)) {
				return c;
			}
		}
		return null;
	}

	// Metodo para agregar carrera
	public static void agregarCarrera(Carrera c) {
		// adding state
		c.setState(true);
		carreras.add(c);
	}

	// metodo para modificar la carrera
	public static void modificarCarrera(Carrera carreraModificada) {
		for (int i = 0; i < carreras.size(); i++) {
			Carrera carrera = carreras.get(i);
			if (carrera.getCode().equals(carreraModificada.getCode())) {
				carreras.set(i, carreraModificada);
				break;
			}
		}
	}

	// metodo para eliminar la carrera
	public static void eliminarCarrera(String codigo) {
		// alterar el estado de Carrera
		// carreras.removeIf(carrera -> carrera.getCode().equals(codigo));
		for (int i = 0; i < carreras.size(); i++) {
			Carrera carrera = carreras.get(i);
			if (carrera.getCode().equals(codigo)) {
				carrera.setState(false);
				break;
			}
		}
	}
}
