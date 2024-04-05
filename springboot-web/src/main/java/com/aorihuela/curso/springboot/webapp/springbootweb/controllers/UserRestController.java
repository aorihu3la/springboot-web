package com.aorihuela.curso.springboot.webapp.springbootweb.controllers;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestController {

    @GetMapping("/details2")
    
    public Map<String, Object> details(){
        Map<String, Object> map = new HashMap<>();
        map.put("title", "Controlador usuario 2024");
        map.put("name", "Alvaro Antonio");
        map.put("lastname", "Orihuela Pastor");        
        map.put("edad", 45); 
        map.put("crack", true); 
        return map;

    }
}
