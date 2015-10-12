package geoand.groovy.algorithms.invertbinarytree

import spock.lang.Specification

/**
 * Created by gandrianakis on 12/10/2015.
 */
class InvertBinaryTreeTest extends Specification {

    static final TreeNode TREE =
            new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9),
                )
            )

    static final TreeNode INVERTED_TREE =
            new TreeNode(4,
                    new TreeNode(7,
                            new TreeNode(9),
                            new TreeNode(6)),
                    new TreeNode(2,
                            new TreeNode(3),
                            new TreeNode(1),
                    )
            )

    def "invertInPlace"() {
        when:
            InvertBinaryTree.invertInPlace(TREE)

        then:
            INVERTED_TREE == TREE
    }
}
