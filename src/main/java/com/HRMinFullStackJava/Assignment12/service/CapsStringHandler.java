package com.HRMinFullStackJava.Assignment12.service;

import com.HRMinFullStackJava.Assignment12.models.StringHandlerInterface;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class CapsStringHandler implements StringHandlerInterface {
    // Assignment 5
    public String ReverseString(String Input){
        String Output = Input.toUpperCase();
        return Output;
    }

    public Integer CountWords(String story){
        Integer count = 1;
        if(story.length() == 0){
            return 0;
        }
        for (int i = 0; i < story.length(); i++){
            if(story.charAt(i) ==  ' '){
                count = count + 1;
            }
        }
        return count;
    }
}