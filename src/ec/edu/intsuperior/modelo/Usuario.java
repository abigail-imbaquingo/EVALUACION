package ec.edu.intsuperior.modelo;


public class Usuario extends Persona{
    private String password;
    private String user;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(String password, String user, String tipoUsuario, String nombre1, String nombre2, String apellido1, String apellido2, String cedula, String direccion, String email, String telefono) {
        super(nombre1, nombre2, apellido1, apellido2, cedula, direccion, email, telefono);
        this.password = password;
        this.user = user;
        this.tipoUsuario = tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
     @Override
    public String toString() {
        return super.toString()+"\n"
                + "";
    }  
}
