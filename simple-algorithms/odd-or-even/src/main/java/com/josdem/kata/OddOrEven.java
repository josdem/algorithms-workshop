package com.josdem.kata;

public class OddOrEven {

    public boolean isEven(String keyword) {
        if(keyword == null || keyword.length() == 0){
            return false;
        }
        return keyword.length() %2 == 0;
    }

}
