package com.example.rev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reverse")
public class Controller {

    @GetMapping
    String reverse(@RequestParam String text)
    {
        byte [] strAsByteArray = text.getBytes();
        byte [] result = new byte [strAsByteArray.length];

        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length-i-1];

        return new String(result);
    }
}
