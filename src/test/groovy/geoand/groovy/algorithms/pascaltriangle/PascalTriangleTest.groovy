package geoand.groovy.algorithms.pascaltriangle

import org.junit.Rule
import org.springframework.boot.test.OutputCapture
import spock.lang.Specification

/**
 * Created by gandrianakis on 12/10/2015.
 */
class PascalTriangleTest extends Specification {

    @Rule
    final OutputCapture capture = new OutputCapture()

    def "createLine"(int line, List<Integer> expectedResult) {
        expect:
            expectedResult == PascalTriangle.createLine(line)
            assertCachingWorks(line)

        where:
            line | expectedResult
            0 | [1]
            1 | [1, 1]
            2 | [1,2,1]
            3 | [1,3,3,1]
            4 | [1,4,6,4,1]
            5 | [1,5,10,10,5,1]
            6 | [1,6,15,20,15,6,1]
    }

    def List<Integer> assertCachingWorks(int line) {
        (0..line).each {
            1 == capture.toString().count("$it")
        }
    }
}
