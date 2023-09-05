package pe.edu.upao.martes.overview;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String username, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.getNombre() + " " + this.getApellidos() + "(" + this.username + ")";
    }
}
