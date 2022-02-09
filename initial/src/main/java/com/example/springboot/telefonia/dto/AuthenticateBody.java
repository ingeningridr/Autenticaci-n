package com.example.springboot.telefonia.dto;

public class AuthenticateBody {

    private String key;
    private String token;
    private String authenticate;


    public AuthenticateBody(String key, String token){
        this.key = String.valueOf(key);
        this.token = token;
        this.authenticate= authenticate;


    }

    public AuthenticateBody() {

        }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(String authenticate) {
        this.authenticate = authenticate;
    }

    @Override
    public String toString() {
        return "telefoniateBody [key=" + key + ",token=" + token  +"]";
    }
}
