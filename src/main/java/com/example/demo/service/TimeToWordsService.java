package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;
@Service
public class TimeToWordsService {
    private final static Map<Integer, String> numberToWordsMap = new TreeMap<>();
    static {
        numberToWordsMap.put(0, "zero");
        numberToWordsMap.put(1, "one");
        numberToWordsMap.put(2, "two");
        numberToWordsMap.put(3, "three");
        numberToWordsMap.put(4, "four");
        numberToWordsMap.put(5, "five");
        numberToWordsMap.put(6, "six");
        numberToWordsMap.put(7, "seven");
        numberToWordsMap.put(8, "eight");
        numberToWordsMap.put(9, "nine");
        numberToWordsMap.put(10, "ten");
        numberToWordsMap.put(11, "eleven");
        numberToWordsMap.put(12, "twelve");
        numberToWordsMap.put(13, "thirteen");
        numberToWordsMap.put(14, "fourteen");
        numberToWordsMap.put(15, "fifteen");
        numberToWordsMap.put(16, "sixteen");
        numberToWordsMap.put(17, "seventeen");
        numberToWordsMap.put(18, "eighteen");
        numberToWordsMap.put(19, "nineteen");
        numberToWordsMap.put(20, "twenty");
        numberToWordsMap.put(21, "twenty-one");
        numberToWordsMap.put(22, "twenty-two");
        numberToWordsMap.put(23, "twenty-three");
        numberToWordsMap.put(24, "twenty-four");
        numberToWordsMap.put(25, "twenty-five");
        numberToWordsMap.put(26, "twenty-six");
        numberToWordsMap.put(27, "twenty-seven");
        numberToWordsMap.put(28, "twenty-eight");
        numberToWordsMap.put(29, "twenty-nine");
        numberToWordsMap.put(30, "thirty");
        numberToWordsMap.put(31, "thirty-one");
        numberToWordsMap.put(32, "thirty-two");
        numberToWordsMap.put(33, "thirty-three");
        numberToWordsMap.put(34, "thirty-four");
        numberToWordsMap.put(35, "thirty-five");
        numberToWordsMap.put(36, "thirty-six");
        numberToWordsMap.put(37, "thirty-seven");
        numberToWordsMap.put(38, "thirty-eight");
        numberToWordsMap.put(39, "thirty-nine");
        numberToWordsMap.put(40, "forty");
        numberToWordsMap.put(41, "forty-one");
        numberToWordsMap.put(42, "forty-two");
        numberToWordsMap.put(43, "forty-three");
        numberToWordsMap.put(44, "forty-four");
        numberToWordsMap.put(45, "forty-five");
        numberToWordsMap.put(46, "forty-six");
        numberToWordsMap.put(47, "forty-seven");
        numberToWordsMap.put(48, "forty-eight");
        numberToWordsMap.put(49, "forty-nine");
        numberToWordsMap.put(50, "fifty");
        numberToWordsMap.put(51, "fifty-one");
        numberToWordsMap.put(52, "fifty-two");
        numberToWordsMap.put(53, "fifty-three");
        numberToWordsMap.put(54, "fifty-four");
        numberToWordsMap.put(55, "fifty-five");
        numberToWordsMap.put(56, "fifty-six");
        numberToWordsMap.put(57, "fifty-seven");
        numberToWordsMap.put(58, "fifty-eight");
        numberToWordsMap.put(59, "fifty-nine");
    }

    public String convertTimeToWords(LocalTime time) {
        int hour = time.getHour();
        int minute = time.getMinute();

        if (hour == 0 && minute == 0) {
            return "It's Midnight";
        }

        if (hour == 12 && minute == 0) {
            return "It's Midday";
        }

        String hourInWords = numberToWordsMap.get(hour % 12 == 0 ? 12 : hour % 12);
        String minuteInWords = minute == 0 ? "o'clock" : numberToWordsMap.get(minute);

        return "It's " + hourInWords + (minute != 0 ? " " + minuteInWords : "");
    }

}
