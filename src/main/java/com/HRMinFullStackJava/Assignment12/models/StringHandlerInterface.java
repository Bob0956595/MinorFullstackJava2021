package com.HRMinFullStackJava.Assignment12.models;

import org.springframework.stereotype.Component;

@Component
public interface StringHandlerInterface {

    Integer CountWords(String text1);

    String ReverseString(String woord2);
}
