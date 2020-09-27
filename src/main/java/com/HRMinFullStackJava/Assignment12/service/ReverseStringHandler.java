package com.HRMinFullStackJava.Assignment12.service;

import com.HRMinFullStackJava.Assignment12.models.StringHandlerInterface;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class ReverseStringHandler implements StringHandlerInterface {
    // Assignment 2
    public String ReverseString(String word){
        String drow = "";
        for (int i = 0; i < word.length(); i++){
            drow = word.charAt(i) + drow;
        }
        return drow;
    }
    // Assignment 3
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
