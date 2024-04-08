package pe.edu.cibertec.waformulariosspring.models;

import lombok.Getter;
import lombok.Setter;


public class LoginModel {


    public String usuario;
    public String password;

    public String getUsuario() {
        return usuario;
    }
    public String getPassword() {
        return password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
