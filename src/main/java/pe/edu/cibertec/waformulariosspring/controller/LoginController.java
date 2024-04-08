package pe.edu.cibertec.waformulariosspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import pe.edu.cibertec.waformulariosspring.models.LoginModel;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("loginModel",new LoginModel());
        return "login";
    }

    public String validarUsuario(@ModelAttribute("loginModel") LoginModel loginModel , Model model){

        return"login";
    }
}
