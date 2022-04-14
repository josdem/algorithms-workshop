package com.josdem.challenge

import spock.lang.Specification

class FastManFinderSpec extends Specification {
    private def finder  = new FastManFinder()

    void "should finds fast and man words"(){
        expect: "I verify I found expected words"
          finder.find('fastman') == ['fast', 'man']
    }

}
