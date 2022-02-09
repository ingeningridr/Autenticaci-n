package com.example.springboot.telefonia.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class LostCallsRest {

    @PostMapping(value = "/lostCalls")
    public String sendLostCallsRest(@RequestParam("lostCalls") String lostCalls, @RequestParam("dini") Date DIni, @RequestParam("dfin") Date DFin, @RequestParam("service") String Service, @RequestParam("lostCalls") String LostCalls) {

        return "Dini " +DIni+ "DFin " + DFin + "service" +Service+ "LostCalls" + LostCalls + "";

    }

}


