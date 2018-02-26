package pe.edu.utp.javawebnovum.models;

public class User {
    private int id;
    private String password;
    private String name;
    private String last_name;
    private String address;
    private String dni;
    private String rol;
    private String email;

    public User() {
    }

    public User(int id, String password, String name, String last_name, String address, String dni, String rol, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.address = address;
        this.dni = dni;
        this.rol = rol;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public User setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public User setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getRol() {
        return rol;
    }

    public User setRol(String rol) {
        this.rol = rol;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
}
