package com.example.springboot.telefonia.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class QueueTimeRest {

    @PostMapping(value = "/queueTime")
    @ResponseBody
    public String sendQueueTimeRest(@RequestParam("queueTime") String queueTime, @RequestParam("dini") Date DIni, @RequestParam("dfin") Date DFin, @RequestParam("service") String Service, @RequestParam("queueTime") String QueueTime) {

        return "Dini " +DIni+ "DFin " + DFin + "service" +Service+ "queueTime" + QueueTime + "";
    }

}

