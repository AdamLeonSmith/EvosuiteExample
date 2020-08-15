package algorithm;

public class MyStack {
    private Element[] noduri;
    public int size;
    public int top;

    public MyStack() {
        this(5);
    }

    public MyStack(int size) {
        this.size = size;
        noduri = new Element[size];
        top = -1;
    }

    public void push(char operator) {
        if (stackIsNotFull()) {
            top++;
            noduri[top] = new Element(operator);
        } else
            resize(operator);
    }

    private void resize(char operator) {
        Element[] temp = new Element[2 * size];
        this.size *= 2;
        for (int i = 0; i < top; i++) {
            temp[i] = new Element(noduri[i].operator);
        }
        noduri = temp;
        push(operator);
    }

    public Element pop() {
        if (stackIsNotEmpty()) {
            top--;
            return noduri[top + 1];
        } else {
            System.out.println("Stiva este goala");
            return null;
        }
    }

    public Element peek() {
        if (stackIsNotEmpty())
            return new Element(noduri[top].operator);
        else
            return null;
    }

    public boolean stackIsNotEmpty() {
        return (-1 != top);
    }

    public boolean stackIsNotFull() {
        return ((size - 1) != top);
    }

}