package com.Edusol.demo.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
@RestController
public class Mobile_brand {
    @RequestMapping("/mobilebrand")
    public HashSet<String> createmobilebrand(){
        HashSet<String> mobilebrand=new HashSet<>();
        mobilebrand.add("Apple");
        mobilebrand.add("Samsung");
        mobilebrand.add("Nokia");
        mobilebrand.add("Redmi");
        mobilebrand.add("Oppo");
        return mobilebrand;

    }
}
