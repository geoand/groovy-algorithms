package geoand.groovy.algorithms.invertbinarytree

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

/**
 * Created by gandrianakis on 12/10/2015.
 */
@ToString(includePackage = false)
@EqualsAndHashCode
class TreeNode {

    final int value

    TreeNode left
    TreeNode right

    TreeNode(int value) {
        this(value, null, null)
    }

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value
        this.left = left
        this.right = right
    }
}
