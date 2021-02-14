package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    //You need to have an h1 with the title “Skills Tracker”,
    // an h2, and an ol containing three programming languages of your choosing

    @GetMapping
    public String list(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn.Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = GetMapping("selection"))
    @PostMapping("selection")
    public String selectFav(@RequestParam String name, @RequestParam String favLanguage,@RequestParam String secondLanguage,@RequestParam String thirdLanguage){
                return  "<html>" +
                        "<head>" +
                        "<style>table, th, td {\n" +
                        "            border: 1px solid black;\n" +
                        "        }\n" +
                        "</style>" + "</head>"+
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<table>" +
                "<tr><th>"+favLanguage+"</th></tr>" +
                "<tr><th>"+secondLanguage+"</th></tr>" +
                "<tr><th>"+thirdLanguage+"</th></tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action = '/selection' method = 'post'>" +
                "<label>Name:</label><input type = 'text' name = 'name' /><br>" +
                "<label><br>My favorite language:</label><br><select name = 'favLanguage'><br>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<label><br>My second favorite language:</label><br><select name = 'secondLanguage'><br>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<label><br>My third language:</label><br><select name = 'thirdLanguage'><br>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<button>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
