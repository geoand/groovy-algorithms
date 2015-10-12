package geoand.groovy.algorithms.invertbinarytree

/**
 * Created by gandrianakis on 12/10/2015.
 */
final class InvertBinaryTree {

    private InvertBinaryTree() {}

    static void invertInPlace(TreeNode root) {
        if(!root) {
            return
        }

        final TreeNode initialLeft = root.left
        final TreeNode initialRight = root.right

        root.right = initialLeft
        root.left = initialRight

        invertInPlace(initialLeft)
        invertInPlace(initialRight)
    }
}
