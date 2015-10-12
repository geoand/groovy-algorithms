package geoand.groovy.algorithms.palindrome

import groovy.transform.TailRecursive

/**
 * Created by gandrianakis on 12/10/2015.
 */
final class Palindrome {

    private Palindrome() {}

    @TailRecursive
    static boolean check(String input) {
        if(input.length() < 2) {
            return true
        }

        if(!input[0].equals(input[-1])) {
            return false
        }

        return check(input.substring(1, input.length()-1))
    }
}
