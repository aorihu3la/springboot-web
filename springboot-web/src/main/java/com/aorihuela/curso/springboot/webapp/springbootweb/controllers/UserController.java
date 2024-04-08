package com.aorihuela.curso.springboot.webapp.springbootweb.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



    /*
    Controller = Es un manejador trolador que gestiona las peticiones del usuario
    Es un manejador del request

    */

@Controller
public class UserController {
    @GetMapping("/details")
/* 
    public String details (Model model){
        model.addAttribute("title", "Controlador usuario 2024");
        model.addAttribute("name", "Alvaro Antonio");
        model.addAttribute("lastname", "Orihuela Pastor");        
        return "details";
    }    
    */
    public String details(Map<String, Object> map){
        map.put("title", "Controlador usuario 2024");
        map.put("name", "Alvaro Antonio");
        map.put("lastname", "Orihuela Pastor");        
        return "details";

    }
}
