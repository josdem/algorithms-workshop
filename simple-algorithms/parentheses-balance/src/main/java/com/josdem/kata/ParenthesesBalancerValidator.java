package com.josdem.kata;

public class ParenthesesBalancerValidator {

    public boolean isBalanced(String keyword) {
        if (keyword == null) {
            return false;
        }
        long opened = keyword.chars().filter(ch -> (char) ch == '(').count();
        long closed = keyword.chars().filter(ch -> (char) ch == ')').count();
        return opened == closed;
    }
}
