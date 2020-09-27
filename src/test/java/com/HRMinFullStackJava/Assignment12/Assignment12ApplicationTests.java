package com.HRMinFullStackJava.Assignment12;

import com.HRMinFullStackJava.Assignment12.controller.StringController;
import com.HRMinFullStackJava.Assignment12.models.StringHandlerInterface;
import com.HRMinFullStackJava.Assignment12.repository.StringRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
// Assignment 6 en 7
@SpringBootTest
@ActiveProfiles("dev")
class Assignment12ApplicationTests {

	// Needed for Assignment 4
	@Mock
	StringRepository stringRepository;

	@Autowired
	StringHandlerInterface stringHandlerInterface;
	@Autowired
	StringController stringController;

	@Test
	@Profile("dev")
	public void ReverseStringTest(){
		// Given
		String woord1 = "cat";
		String woord2 = "";
		String woord3 = "mouse";

		// When
		String result1 = stringHandlerInterface.ReverseString(woord1);
		String result2 = stringHandlerInterface.ReverseString(woord2);
		String result3 = stringHandlerInterface.ReverseString(woord3);

		// Then
		assert(result1).equals("tac");
		assert(result2).equals("");
		assert(result3).equals("esuom");
	}

	@Test
	@Profile("prod")
	public void CapsStringTest(){
		// Given
		String woord1 = "cat";
		String woord2 = "";

		// When
		String result1 = stringHandlerInterface.ReverseString(woord1);
		String result2 = stringHandlerInterface.ReverseString(woord2);

		// Then
		assert(result1).equals("CAT");
		assert(result2).equals("");
	}

	@Test
	public void ReverseStringTester(){
		// Given
		String woord1 = "cat";
		String woord2 = "";

		// When
		String result1 = stringController.ControllerReverseString(woord1);
		String result2 = stringController.ControllerReverseString(woord2);

		// Then
		assert(result1).equals("tac");
		assert(result2).equals("");
	}

	@Test
	public void CountWordsTester(){
		// Given
		String text1 = "Dit is niet een lang verhaal";
		String text2 = "";
		String text3 = "Woord";

		// When
		Integer result1 = stringHandlerInterface.CountWords(text1);
		Integer result2 = stringHandlerInterface.CountWords(text2);
		Integer result3 = stringHandlerInterface.CountWords(text3);

		// Then
		assert(result1).equals(6);
		assert(result2).equals(0);
		assert(result3).equals(1);
		Assertions.assertEquals(result3,1);
	}

}
