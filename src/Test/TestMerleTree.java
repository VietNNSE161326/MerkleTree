package Test;

import main.MerkleTree;
import main.Node;

import java.util.ArrayList;

public class TestMerleTree {
    public static void main(String[] args) {
        ArrayList<String> dataBlocks = new ArrayList<>();
        dataBlocks.add("A giao dich voi B");
        dataBlocks.add("A giao dich voi C");
        dataBlocks.add("A giao dich voi D");
        dataBlocks.add("A giao dich voi E");
        dataBlocks.add("A giao dich voi F");
        Node root = MerkleTree.generateTree(dataBlocks);
        MerkleTree.printLevelOrderTraversal(root);
    }
}
