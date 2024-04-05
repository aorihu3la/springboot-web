package com.aorihuela.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



    /*
    Controller = Es un manejador trolador que gestiona las peticiones del usuario
    Es un manejador del request

    */

@Controller
public class UserController {
    @GetMapping("/details")
    
    public String details (){
     
        return "details";
    }    
}
