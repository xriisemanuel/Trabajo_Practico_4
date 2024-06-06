//package ar.edu.unju.fi.collections;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import ar.edu.unju.fi.model.Carrera;
//import ar.edu.unju.fi.model.Docente;
//
//public class ListadoCarreras {
//	public static List<Carrera> carreras = new ArrayList<Carrera>();
//
//	//metodo para listar carreras
//	public static List<Carrera> listarCarreras() {
//		return carreras;
//	}
//	//metodo para buscar una carrera por id
//	public static Carrera buscarDocentePorLegajo(String codigo) {
//		for (Carrera c: carreras) {
////			if (c.getCode().equals(codigo)) {
////				return c;
////			}
//		}
//		return null;
//	}
//	public static void agregarCarrera(Carrera c) {
//		carreras.add(c);
//	}
//	//metodo para modificar la carrera
//	public static void modificarCarrera(Carrera carreraModificada) {
//		for (int i = 0; i < carreras.size(); i++) {
//			Carrera carrera = carreras.get(i);
//			if (carrera.getCode().equals(carreaModificada.getCode())) {
//				carreras.set(i, carreraModificada);
//				break;
//			}
//		}
//	}
//	//metodo para eliminar la carrera
//	public static void eliminarCarrera(String codigo) { 
//		carreras.removeIf(carrera -> carrera.getCode().equals(codigo));
//	}
//}
