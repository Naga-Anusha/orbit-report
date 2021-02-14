package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    @PostMapping("goodbye")
    @ResponseBody
    public String goodBye(){
        return "GoodBye, Spring!";
    }

    // Responds to get requests at /hello?coder=LaunchCoder
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String coder, Model model) {
        String greeting = "Hello, " + coder + "!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }

    // Responds to get requests at /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name,Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }

    @GetMapping
    public String helloForm() {
        return "form1";
    }
    // Responds to get requests at /hello?coder=LaunchCoder
    @RequestMapping(value = "hellolanguage", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public static String createMethod(@RequestParam String coder, @RequestParam String language) {

        return language + coder + "!";
    }
    //Responds to post request/form
    @GetMapping("form")

    public String helloFormWithMultiLang() {
         return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names",names);
        return "hello-list";
    }

}
