package com.example.springboot.telefonia.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class SurveyRest {

    @PostMapping(value = "/survey")
    @ResponseBody
    public String sendSurveyRest(@RequestParam("survey") String survey, @RequestParam("dini") Date DIni,
    @RequestParam("dfin") Date DFin, @RequestParam("service") String Service, @RequestParam("survey") String Survey) {

        return "Dini " +DIni+ "DFin " + DFin + "service" +Service+ "survey" + Survey + "";
    }

}

