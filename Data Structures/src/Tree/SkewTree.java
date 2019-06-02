package Tree;

/**
 * Class that create skew tree and print all the nodes
 */
public class SkewTree {

    private TreeNode root;

    public static void main(String[] args) {
        SkewTree tree = new SkewTree();
        tree.addNode(1);
        tree.addNode(2);
        tree.addNode(3);
        tree.addNode(4);
        tree.addNode(5);
        tree.addNode(6);
        tree.addNode(7);
        tree.addNode(8);


        tree.printTreeNodes(tree.root);
    }

    /**
     * Method to add new node in the tree
     *
     * @param value integer value for the node data
     */
    private void addNode(int value) {
        root = addTreeNode(root, value);
    }

    /**
     * Method that actually add node to tree recursively
     *
     * @param current current node
     * @param value   data value for the node
     * @return root node of type TreeNode
     */
    private TreeNode addTreeNode(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        // if value is even add to left subtree else add add to right sub tree
        if (current.leftNode == null && current.rightNode == null) {
            if (value % 2 == 0)
                current.leftNode = new TreeNode(value);
            else
                current.rightNode = new TreeNode(value);

        } else {
            if (current.leftNode != null)
                addTreeNode(current.leftNode, value);
            else
                addTreeNode(current.rightNode, value);
        }

        return current;
    }

    /**
     * Method to print all nodes of the tree
     * @param node root node
     */
    private void printTreeNodes(TreeNode node) {
        if (node == null)
            System.out.print("Empty Tree");
        else {
            System.out.println(node.nodeData);

            while (node.leftNode != null || node.rightNode != null)
                if (node.leftNode != null) {
                    System.out.println(node.leftNode.nodeData);
                    node = node.leftNode;
                } else {
                    System.out.println(node.rightNode.nodeData);
                    node = node.rightNode;
                }
        }
    }
}
