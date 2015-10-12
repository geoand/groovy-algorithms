package geoand.groovy.algorithms.palindrome

import spock.lang.Specification

/**
 * Created by gandrianakis on 12/10/2015.
 */
class PalindromeTest extends Specification {

    def "check"(String input, boolean isPalindrome) {
        expect:
            isPalindrome == Palindrome.check(input)

        where:
            input | isPalindrome
            "" | true
            "a" | true
            "aba" | true
            "abba" | true
            "abbabba" | true
            "abbaabba" | true
            "ab" | false
            "abab" | false
            "abaa" | false
    }
}
