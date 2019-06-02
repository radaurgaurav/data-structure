package Tree;

class PrintTreeClass {

    /**
     * Method to print all nodes of the tree
     *
     * @param node rootNode
     */
    static void printTreeNodes(TreeNode node) {
        if (node == null)
            System.out.print("Empty Tree");
        else {
            System.out.println("Root Node -" + node.getNodeData());

            while (node.getLeftNode() != null || node.getRightNode() != null)
                if (node.getLeftNode() != null) {
                    System.out.println("Left Node -" + node.getLeftNode().getNodeData());
                    node = node.getLeftNode();
                } else {
                    System.out.println("Right Node - " + node.getRightNode().getNodeData());
                    node = node.getRightNode();
                }
        }
    }
}
