package com.example.springboot.telefonia.controller;


import java.util.Date;
public class HandlingTimeRest {

    @PostMapping(value = "/report/handlingTime")
    public String sendHandlingTimeRest(@RequestParam("dIni") Date DIni, @RequestParam("dFin") Date DFin, @RequestParam("service") String Service) {

        return "Dini " +DIni+ "DFin " + DFin + "service" +Service+ "";

    }

}
