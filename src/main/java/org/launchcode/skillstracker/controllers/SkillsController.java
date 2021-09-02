package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SkillsController {

    @GetMapping("sample")
    public String skillList() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>1. Java</li>" +
                "<li>2. JavaScript</li>" +
                "<li>3. Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }
}
