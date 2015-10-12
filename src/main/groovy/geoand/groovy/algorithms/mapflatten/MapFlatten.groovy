package geoand.groovy.algorithms.mapflatten

/**
 * Created by gandrianakis on 12/10/2015.
 */
final class MapFlatten {

    private MapFlatten() {}

    static Map perform(Map map, String concatChar = '.') {
        return map.collectEntries { key, value ->
            value instanceof Map ? perform(value).collectEntries { q, r ->  [(key + concatChar + q): r] } : [(key):value]
        }
    }
}
