/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fs.personaltrainer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author farhanshahbaz
 */
@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String displayworkouts(Model model) {
        
        return "/login";
    }
   
}
