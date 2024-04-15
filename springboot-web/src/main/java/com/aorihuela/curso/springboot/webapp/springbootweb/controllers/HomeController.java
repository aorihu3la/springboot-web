package com.aorihuela.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home(){
        return "redirect:/details";  //detail
        //return "forward:/details"; //
    }

    /*
     * Description of Forward Vs. Redirect
        The forward( ) method is used to forward the request from one JSP to another or from one JSP to a servlet, or from one JSP to another resource in a web application. 
        The control is passed internally by the container and the browser/client is not involved in the process. The forward method is declared in the RequestDispatcher. 
        The SendRedirect( ) method is declared in HttPServletResponse and is used to redirect the client request to a different URL which is available on a different server or context. 
        With a redirect, you can redirect the browser to a different application altogether.
        
     */

}
