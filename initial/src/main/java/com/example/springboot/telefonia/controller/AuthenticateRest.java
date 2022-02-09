package com.example.springboot.telefonia.controller;


import static org.yaml.snakeyaml.tokens.Token.ID.Key;

@RestController
@RequestMapping(value = "/login")
public class AuthenticateRest {

    @PostMapping(value = "/authenticate")
   public String sendAuthenticateRest(@RequestParam("key") String key, @RequestParam("token") String Token) {

            return "key " + Key+ "token " + Token + "";

        }

}