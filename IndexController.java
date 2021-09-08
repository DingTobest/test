/**
 * 
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Hello World!");
        return "index";
    }
}
