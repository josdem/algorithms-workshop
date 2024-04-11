package com.josdem.kata;

public class UppercaseCounter {

    public int count(String message) {
        return message.chars().filter(Character::isUpperCase).toArray().length;
    }

    public boolean hasSpace(String message) {
        return message.contains(" ");
    }
}
