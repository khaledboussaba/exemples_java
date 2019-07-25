package fr.pileEntier;

public class Node {

    private int value;

    private Node previousElement;

    public Node(Node previousElement, int value) {
        this.previousElement = previousElement;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getPreviousElement() {
        return previousElement;
    }

}
