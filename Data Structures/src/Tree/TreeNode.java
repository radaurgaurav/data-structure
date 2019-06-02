package Tree;


public class TreeNode {
    private int nodeData;
    private TreeNode leftNode;
     private TreeNode rightNode;

    public TreeNode(int nodeData) {
        this.nodeData=nodeData;
        this.leftNode = null;
        this.rightNode = null;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getLeftNode()
    {
        return leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getRightNode()
    {
        return rightNode;
    }

    public int getNodeData()
    {
        return nodeData;
    }
}