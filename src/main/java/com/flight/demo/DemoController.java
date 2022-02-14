package com.flight.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("/demo/list")
    List<String> list() {
        return generateArrayList(10);
    }

    public static List<String> generateArrayList(int n){
        List<String> stringArray = new ArrayList<>();
        for (int i=0;i<n;i++){
            String str= "Test" + i;
            stringArray.add(str);
        }
        return stringArray;
    }
}
