package com.heroku.herokuci;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

class User{
    public String name;
    public String surname;
    public String listo;
}

@RestController
class AController {
    AController(){
    }

    @GetMapping("/api")
    String api(){
        return "API is on";
    }

    @PostMapping("/api")
    User userNew(@RequestBody User u) {
        return u;
    }


}
