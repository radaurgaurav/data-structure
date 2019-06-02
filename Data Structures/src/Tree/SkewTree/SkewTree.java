package Tree.SkewTree;


import Tree.TreeNode;

/**
 * Class that create skew tree and print all the nodes
 */
public class SkewTree {

    private TreeNode rootNode;

    public TreeNode getRootNode() {
        return rootNode;
    }

    /**
     * Method to add new node in the tree
     *
     * @param value integer value for the node data
     */
    public void addNode(int value) {
        rootNode = addTreeNode(rootNode, value);
        //rootNode = addNodeInRightSkewTree(rootNode, value);
        //rootNode = addNodeInLeftSkewTree(rootNode, value);
    }

    /**
     * Method that actually add node to right skew tree recursively
     *
     * @param rootNode rootNode node
     * @param value    data value for the node
     * @return rootNode node of type TreeNode
     */
    private TreeNode addNodeInRightSkewTree(TreeNode rootNode, int value) {
        if (rootNode == null) {
            return new TreeNode(value);
        }

        // if value is even add to left subtree else add add to right sub tree
        if (rootNode.getRightNode() == null) {
            rootNode.setRightNode(new TreeNode(value));
        } else {
            addNodeInRightSkewTree(rootNode.getRightNode(), value);
        }

        return rootNode;
    }

    /**
     * Method that actually add node to Left skew tree recursively
     *
     * @param rootNode rootNode node
     * @param value    data value for the node
     * @return rootNode node of type TreeNode
     */
    private TreeNode addNodeInLeftSkewTree(TreeNode rootNode, int value) {
        if (rootNode == null) {
            return new TreeNode(value);
        }

        // if value is even add to left subtree else add add to right sub tree
        if (rootNode.getLeftNode() == null) {
            rootNode.setLeftNode(new TreeNode(value));
        } else {
            addNodeInLeftSkewTree(rootNode.getLeftNode(), value);
        }

        return rootNode;
    }


    /**
     * Method that actually add node to tree recursively
     *
     * @param rootNode rootNode node
     * @param value    data value for the node
     * @return rootNode node of type TreeNode
     */
    private TreeNode addTreeNode(TreeNode rootNode, int value) {
        if (rootNode == null) {
            return new TreeNode(value);
        }

        // if value is even add to left subtree else add add to right sub tree
        if (rootNode.getLeftNode() == null && rootNode.getRightNode() == null) {
            if (value % 2 == 0)
                rootNode.setLeftNode(new TreeNode(value));
            else
                rootNode.setRightNode(new TreeNode(value));

        } else {
            if (rootNode.getLeftNode() != null)
                addTreeNode(rootNode.getLeftNode(), value);
            else
                addTreeNode(rootNode.getRightNode(), value);
        }

        return rootNode;
    }

    public boolean checkSkewTreeOrNot(TreeNode rootNode) {
        boolean isSkewTree = false;
        if (rootNode == null || (rootNode.getLeftNode() == null && rootNode.getRightNode() == null))
            return true;
        if (rootNode.getLeftNode() != null && rootNode.getRightNode() != null)
            return false;

        if (rootNode.getRightNode() != null)
            return checkSkewTreeOrNot(rootNode.getRightNode());
        else
            return checkSkewTreeOrNot(rootNode.getLeftNode());
    }
}
