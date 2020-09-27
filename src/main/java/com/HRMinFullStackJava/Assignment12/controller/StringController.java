package com.HRMinFullStackJava.Assignment12.controller;

import org.springframework.stereotype.Controller;

@Controller
public class StringController {
        // Assignment 1
        public static String ControllerReverseString(String Input){
            String Output = "";
            for (int i = 0; i < Input.length(); i++){
                Output = Input.charAt(i) + Output;
            }
            return Output;
        }
}