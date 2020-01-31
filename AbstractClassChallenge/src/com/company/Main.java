package com.company;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        // Hanoi Hue HaiPhong NgheAn ConDao HaTinh SaiGon CanTho VinhLong Hanoi
//        String stringData = "9 8 3 7 2 0 5 1 4 6";
        String stringData = "Hanoi Hue HaiPhong NgheAn ConDao HaTinh SaiGon CanTho VinhLong Hanoi";
        String[] data = stringData.split(" ");

        for (String s : data) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());

//        tree.removeItem(new Node("2"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("8"));
//        tree.removeItem(new Node("4"));
//        tree.removeItem(new Node("0"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("1"));
//        tree.removeItem(new Node("3"));
//        tree.removeItem(new Node("5"));
//        tree.removeItem(new Node("6"));
//        tree.removeItem(new Node("7"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(tree.getRoot());
//        tree.traverse(tree.getRoot());
    }
}
