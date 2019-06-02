package Tree;

/**
 * Class that create skew tree and print all the nodes
 */
public class SkewTree {

    private TreeNode rootNode;

    public static void main(String[] args) {
        SkewTree tree = new SkewTree();

        for (int i = 1; i < 10; i++)
            tree.addNode(i);


        tree.printTreeNodes(tree.rootNode);
    }

    /**
     * Method to add new node in the tree
     *
     * @param value integer value for the node data
     */
    private void addNode(int value) {
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
        if (rootNode.rightNode == null) {
            rootNode.rightNode = new TreeNode(value);
        } else {
            addNodeInRightSkewTree(rootNode.rightNode, value);
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
        if (rootNode.leftNode == null) {
            rootNode.leftNode = new TreeNode(value);
        } else {
            addNodeInLeftSkewTree(rootNode.leftNode, value);
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
        if (rootNode.leftNode == null && rootNode.rightNode == null) {
            if (value % 2 == 0)
                rootNode.leftNode = new TreeNode(value);
            else
                rootNode.rightNode = new TreeNode(value);

        } else {
            if (rootNode.leftNode != null)
                addTreeNode(rootNode.leftNode, value);
            else
                addTreeNode(rootNode.rightNode, value);
        }

        return rootNode;
    }

    /**
     * Method to print all nodes of the tree
     *
     * @param node rootNode
     */
    private void printTreeNodes(TreeNode node) {
        if (node == null)
            System.out.print("Empty Tree");
        else {
            System.out.println("Root Node -" + node.nodeData);

            while (node.leftNode != null || node.rightNode != null)
                if (node.leftNode != null) {
                    System.out.println("Left Node -" + node.leftNode.nodeData);
                    node = node.leftNode;
                } else {
                    System.out.println("Right Node - " + node.rightNode.nodeData);
                    node = node.rightNode;
                }
        }
    }
}
