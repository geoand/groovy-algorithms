package geoand.groovy.algorithms.pascaltriangle

import groovy.transform.Memoized
import groovy.util.logging.Slf4j

/**
 * Created by gandrianakis on 12/10/2015.
 */
@Slf4j
final class PascalTriangle {

    private static final int DEFAULT_VALUE = 1
    private static final SINGLE_DEFAULT_ELEMENT_LIST = [DEFAULT_VALUE]

    private PascalTriangle() {}

    @Memoized
    public static List<Integer> createLine(Integer line) {
        log.debug("called for line $line")

        switch (line) {
            case 0:
                return SINGLE_DEFAULT_ELEMENT_LIST

            case 1:
                return SINGLE_DEFAULT_ELEMENT_LIST + SINGLE_DEFAULT_ELEMENT_LIST

            default:
                return SINGLE_DEFAULT_ELEMENT_LIST + (1..(line-1)).collect{column -> cellValue(line, column)} + SINGLE_DEFAULT_ELEMENT_LIST
        }
    }

    private static  Integer cellValue(Integer line, Integer column) {
        final List<Integer> previousLine = createLine(line-1)
        return previousLine[column-1] + previousLine[column]
    }
}
