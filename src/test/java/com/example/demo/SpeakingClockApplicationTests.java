package com.example.demo;

import com.example.demo.service.TimeToWordsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpeakingClockApplicationTests {

	@Autowired
	private TimeToWordsService timeToWordsService;

	@Test
	void testConvertMidnight() {
		assertEquals("It's Midnight", timeToWordsService.convertTimeToWords(LocalTime.of(0, 0)));
	}

	@Test
	void testConvertMidday() {
		assertEquals("It's Midday", timeToWordsService.convertTimeToWords(LocalTime.of(12, 0)));
	}

	@Test
	void testConvertTimeToWords() {
		assertEquals("It's one fifteen", timeToWordsService.convertTimeToWords(LocalTime.of(1, 15)));
		assertEquals("It's three forty five", timeToWordsService.convertTimeToWords(LocalTime.of(3, 45)));
		assertEquals("It's eleven fifty nine", timeToWordsService.convertTimeToWords(LocalTime.of(11, 59)));
	}

}
