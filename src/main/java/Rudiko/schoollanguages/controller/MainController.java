package Rudiko.schoollanguages.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/unsecured")
    public String unsecuredData(){
        return "Unsecured Data";
    }

    @GetMapping("/secured")
    public String securedData(){
        return "Secured Data";
    }

    @GetMapping("/info")
    public String getInfo(Principal principal){
        return principal.getName();
    }
}
