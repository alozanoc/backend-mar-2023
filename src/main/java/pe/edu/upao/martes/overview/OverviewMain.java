package pe.edu.upao.martes.overview;

import pe.edu.upao.martes.models.Usuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class OverviewMain {

    static String authenticatedUsername = "anónimo";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static ArrayList<Usuario> usuarioList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String opc = "";
        while (!opc.equalsIgnoreCase("F")) {
            System.out.println("-------- Menu -----------");
            System.out.println("Hola usuario: " + authenticatedUsername);
            System.out.println("A. Crear usuario");
            System.out.println("B. Autenticar Usuario");
            System.out.println("C. Listar Usuarios");
            System.out.println("D. Eliminar Usuarios");
            System.out.println("E. Cerrar Sesión");
            System.out.println("F. Salir");
            opc = br.readLine();

            switch (opc.toUpperCase()) {
                case "A" -> crearUsuario();
                case "B" -> autenticar();
                case "C" -> listarUsuario();
                case "D" -> eliminarUsuario();
                case "E" -> cerrarSesion();
                case "F" -> {
                }
                default -> System.out.println("Opción incorrecta.");
            }
        }
    }

    private static void cerrarSesion() {
        authenticatedUsername = "anónimo";
    }

    private static void eliminarUsuario() {

    }

    private static void autenticar() throws IOException {
        System.out.println("Ingrese su usuario: ");
        String username = br.readLine();
        System.out.println("Ingrese su password: ");
        String password = br.readLine();
        /*
        // FORMA CLASICA
        Usuario usuario = null;
        for (Usuario it: usuarioList) {
            if(it.getUsername().equalsIgnoreCase(username) && it.getPassword().equals(password)) {
                usuario = it;
            }
        }

        if (usuario != null) {
            authenticatedUsername = usuario.getUsername();
            System.out.println("Bienvenido " + usuario);
        } else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }
        */
        // Ejemplo de stream para remapear a mayúsculas + filtros
        /*
        List<String> usernameInUppercase = usuarioList.stream()
                .map(it -> it.getUsername().toUpperCase())
                .filter(it -> it.startsWith("A"))
                .toList();
        */

        Stream<Usuario> filteredList = usuarioList.stream().filter((it) -> {
            return it.getUsername().equalsIgnoreCase(username) && it.getPassword().equals(password);
        });
        Optional<Usuario> usuarioOptional = filteredList.findFirst();

        if (usuarioOptional.isPresent()) {
            authenticatedUsername = usuarioOptional.get().getUsername();
            System.out.println("Bienvenido " + authenticatedUsername);
        } else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }

    }

    static void crearUsuario() throws IOException {
        System.out.println("Ingrese su usuario: ");
        String username = br.readLine();
        System.out.println("Ingrese su password: ");
        String password = br.readLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = br.readLine();
        System.out.println("Ingrese su apellidos: ");
        String apellidos = br.readLine();

        Usuario usuario = new Usuario(nombre, apellidos, username, password);
        usuarioList.add(usuario);
    }

    static void listarUsuario() {
        for (Usuario usuario : usuarioList) {
            System.out.println("-" + usuario);
        }
    }
}
