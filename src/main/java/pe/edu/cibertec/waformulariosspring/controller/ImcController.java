package pe.edu.cibertec.waformulariosspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.cibertec.waformulariosspring.models.ImcModel;

@Controller
public class ImcController {
    @GetMapping("/imc")
    public String inicioIMC(Model model){
        model.addAttribute("imcModel",new ImcModel());
        model.addAttribute("mostrarMensaje",false);
        return("imc");

    }

    @PostMapping("/imc")
    public String calcularImc(@ModelAttribute ("imcModel") ImcModel imcModel , Model model){
        double tallam= imcModel.getTalla()/100;
        double valorImc=imcModel.getPeso() / (tallam + tallam);
        String diagnostigo = "";
        if(valorImc < 18.5){
            diagnostigo = "Por debajo del Peso";
        }
        else if(valorImc <= 25){
            diagnostigo = "Peso normal";
        } else if (valorImc <= 30) {
            diagnostigo ="Con Sobrepesp";
        } else if (valorImc <=35) {
            diagnostigo ="Con Obesidad Leve";
        } else if (valorImc <=39) {
            diagnostigo ="Con Obesidad Media";
        }else {
            diagnostigo ="Con Obesidad Morbida";
        }
        model.addAttribute("mostrarMensaje",true);
        model.addAttribute("resultado","Su Valor IMC es :"+String.format("%.2f",valorImc)
        +" , usted se encuentra en "+diagnostigo);
        return "imc";
    }
}
