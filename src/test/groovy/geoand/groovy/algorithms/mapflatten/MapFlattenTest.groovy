package geoand.groovy.algorithms.mapflatten

import spock.lang.Specification

/**
 * Created by gandrianakis on 12/10/2015.
 */
class MapFlattenTest extends Specification {

    static final Map INPUT = [k1: 'v1', k2: 'v2', k3: [k4: 'v4', k5: ['v5'], k6: [k7: 'v7']]]
    static final Map FLATTENED = [k1:'v1', k2:'v2', 'k3.k4':'v4', 'k3.k5':['v5'], 'k3.k6.k7' : 'v7']

    def "perform"() {
        expect:
            FLATTENED == MapFlatten.perform(INPUT)
    }
}
