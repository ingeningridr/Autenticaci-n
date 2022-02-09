package com.example.springboot.telefonia.controller;

import com.example.springboot.telefonia.Interface.CallsPort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class CallsRest {

    @Autowired
    private CallsPort callsPort;

    @PostMapping(value = "/calls")
    public String sendCallsRest(@RequestParam("calls") String calls, @RequestParam("dini") Date DIni, @RequestParam("dfin") Date DFin, @RequestParam("service") String Service, @RequestParam("calls") String Calls) {

        return "dini " +DIni+ "dfin " + DFin + "service" +Service+ "calls" + Calls + "";

    }
}