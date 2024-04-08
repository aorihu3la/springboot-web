package com.aorihuela.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;

import com.aorihuela.curso.springboot.webapp.springbootweb.controllers.models.dto.ParamMixDto;



@RestController
public class RequestParamsController {

    @GetMapping("/request")

    public ParamMixDto request(HttpServletRequest request){
        Integer code = 0;

        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
        }

        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;   
    }

}
