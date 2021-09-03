package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("")
public class SkillsController {

    @GetMapping
    public String skillList() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    public String skillForm() {
        return "<html>" +
                "<body>" +
                "<h2>Name:</h2>" +
                "<form action='form' method='post'>" +
                "<input type='text' name='name'>" +
                "<h2>My favorite language:</h2>" +
                "<select name='skill1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<h2>My second favorite language:</h2>" +
                "<select name='skill2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>"+
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<h2>My third favorite language:</h2>" +
                "<select name='skill3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @RequestMapping(value="form", method = {RequestMethod.POST})
    @ResponseBody
    public String skillPost(@RequestParam String name, String skill1, String skill2, String skill3){
        return "<html>" +
                "<body>" +
                "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" +
                skill1 +
                "</li>" +
                "<li>" +
                skill2 +
                "</li>" +
                "<li>" +
                skill3 +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
