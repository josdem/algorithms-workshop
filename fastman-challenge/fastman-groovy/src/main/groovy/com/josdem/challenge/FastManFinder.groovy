package com.josdem.challenge

class FastManFinder {

    def dictionary = ['fast', 'fat', 'man', 'strong']

    def find(String keyword) {
        return dictionary << keyword
    }
}
