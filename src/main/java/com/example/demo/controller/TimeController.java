package com.example.demo.controller;

import com.example.demo.service.TimeToWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class TimeController {
    @Autowired
    private TimeToWordsService timeToWordsService;

    @GetMapping("/current-time")
    public String getCurrentTimeInWords() {
        LocalTime currentTime = LocalTime.now();
        return timeToWordsService.convertTimeToWords(currentTime);
    }

    @GetMapping("/convert-time/{time}")
    public String convertTimeToWords(@PathVariable("time") String time) {
        return timeToWordsService.convertTimeToWords(LocalTime.parse(time));
    }
}
