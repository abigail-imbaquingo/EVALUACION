package ec.edu.intsuperior.modelo;


public class Persona {
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String cedula;
    private String direccion;
    private String email;
    private String telefono;
    
    public Persona (){
        
    }

    public Persona(String nombre1, String nombre2, String apellido1, String apellido2, String cedula, String direccion, String email, String telefono) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cedula: " +getCedula()+"\n"
                + "Nombre: " +getNombre1()+" "+getNombre2()+" "+getApellido1()+" "+getApellido2()+"\n"
                + "Direccion: " +getDireccion()+"\n"
                + "Email: " +getEmail()+"\n"
                + "Telefono: " +getTelefono()+"\n";
                }
    
    
}
