package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by freedom on 2016/4/10.
 */
@Controller
public class defaultController {

    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/login/login", method = GET)
    public String login(Model model) {
        return "/login/login";
    }
}
