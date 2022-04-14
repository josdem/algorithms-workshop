package com.josdem.challenge

/*
Given A string with no spaces
And a source dictionary as words in an array
When I call to find method
Then I validate expected words are found
 */

import spock.lang.Specification

class FastManFinderSpec extends Specification {
    private def finder  = new FastManFinder()

    void "should finds fast and man words"(){
        expect: "I verify I found expected words"
          finder.find('fastman') == ['fast', 'man']
    }

}
