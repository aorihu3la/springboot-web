package com.aorihuela.curso.springboot.webapp.springbootweb.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aorihuela.curso.springboot.webapp.springbootweb.controllers.models.User;
import com.aorihuela.curso.springboot.webapp.springbootweb.controllers.models.dto.ParamDto;


@RestController
@RequestMapping ("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable() String message ){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id){
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);    

        return json;
    }
    
    @PostMapping("/create")
    public User create(@RequestBody User user){

        if(user.getName() == null){
            user.setName(" ");    
        } else {
            user.setName(user.getName().toUpperCase());        
        
        }

        //(largo > 0) ?  user.setName(user.getName().toUpperCase()) : user.setName(" ") ;
        user.setLastname(user.getLastname());
        user.setEmail(user.getEmail().toUpperCase());
        return user;
    }

}
 