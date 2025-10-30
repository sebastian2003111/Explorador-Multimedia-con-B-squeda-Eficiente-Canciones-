import java.util.LinkedList;
import java.util.Scanner;

// ==== Clase principal ====
public class ExploradorMultimedia {

    // ==== Clase Cancion ====
    static class Cancion {
        String nombre;
        String artista;
        String genero;
        int anio;

        // Constructor
        public Cancion(String nombre, String artista, String genero, int anio) {
            this.nombre = nombre;
            this.artista = artista;
            this.genero = genero;
            this.anio = anio;
        }

        @Override
        public String toString() {
            return nombre + " - " + artista + " (" + genero + ", " + anio + ")"; // Formato de salida
        }
    }

    // ==== Clase TablaHash ====
    static class TablaHash {
        private LinkedList<Cancion>[] tabla;
        private int tamaño;

        @SuppressWarnings("unchecked")
        public TablaHash(int tamaño) {
            this.tamaño = tamaño;
            tabla = new LinkedList[tamaño];
            for (int i = 0; i < tamaño; i++) {
                tabla[i] = new LinkedList<>();
            }
        }

        // Función hash
        private int hash(String clave) {
            return Math.abs(clave.hashCode() % tamaño);
        }

        // Insertar canción
        public void insertar(Cancion c) {
            int indice = hash(c.nombre);
            tabla[indice].add(c);
        }

        // Buscar canción por nombre
        public Cancion buscar(String nombre) {
            int indice = hash(nombre);
            for (Cancion c : tabla[indice]) {
                if (c.nombre.equalsIgnoreCase(nombre)) {
                    return c;
                }
            }
            return null;
        }

        // Eliminar canción por nombre
        public boolean eliminar(String nombre) {
            int indice = hash(nombre);
            return tabla[indice].removeIf(c -> c.nombre.equalsIgnoreCase(nombre));
        }

        // Listar todas las canciones
        public void listar() {
            System.out.println("\n=== LISTADO DE CANCIONES ===");
            for (int i = 0; i < tamaño; i++) {
                if (!tabla[i].isEmpty()) {
                    System.out.println("Índice " + i + ": " + tabla[i]);
                }
            }
        }
    }

    // ==== Método principal ====
    public static void main(String[] args) {
        TablaHash tabla = new TablaHash(10);
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== EXPLORADOR DE MÚSICA ===");
            System.out.println("1. Agregar canción");
            System.out.println("2. Buscar canción");
            System.out.println("3. Eliminar canción");
            System.out.println("4. Listar canciones");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            // ==== Manejo de opciones ====
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Género: ");
                    String genero = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    tabla.insertar(new Cancion(nombre, artista, genero, anio));
                    System.out.println(" Canción registrada con éxito.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre de la canción a buscar: ");
                    String buscar = sc.nextLine();
                    Cancion encontrada = tabla.buscar(buscar);
                    if (encontrada != null)
                        System.out.println(" Cancion encontrada: " + encontrada);
                    else
                        System.out.println(" No se encontro la cancion.");
                    break;

                case 3:
                    System.out.print("Ingrese el nombre de la canción a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (tabla.eliminar(eliminar))
                        System.out.println(" Canción eliminada correctamente.");
                    else
                        System.out.println(" No se encontró la cancion.");
                    break;

                case 4:
                    tabla.listar();
                    break;

                case 0:
                    System.out.println(" Saliendo del sistema...");
                    break;

                default:
                    System.out.println(" Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
