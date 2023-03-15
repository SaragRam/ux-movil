package com.example.hplusalarma;

public class GlobalVars {
    private static GlobalVars instance;
    private String usuario;
    private String contraseña;
    private String nombreCompleto;
    private String correo;

    private GlobalVars() {}

    public static GlobalVars getInstance() {
        if (instance == null) {
            instance = new GlobalVars();
        }
        return instance;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}