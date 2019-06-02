package Tree;

import Tree.SkewTree.SkewTree;

public class SkewTreeTest {

    public static void main(String[] args) {

        SkewTree tree = new SkewTree();

        for (int i = 1; i < 10; i++)
            tree.addNode(i);

        PrintTreeClass.printTreeNodes(tree.getRootNode());

        System.out.println("Is tree Skew - " + tree.checkSkewTreeOrNot(tree.getRootNode()));
    }
}

