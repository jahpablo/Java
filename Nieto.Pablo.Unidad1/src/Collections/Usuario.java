package Collections;

public class Usuario {
    private int id;
    private String nombre;
    private String paterno;
    private String email;
    private float sueldo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaterno() {
        return paterno;
    }
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getSueldo() {
        return sueldo;
    }
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public Usuario(){        
    }
    public Usuario(int id, String nombre, String paterno, String email, float sueldo){
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.email = email;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", email=" + email + ", sueldo=" + sueldo + '}';
    }
    
}

