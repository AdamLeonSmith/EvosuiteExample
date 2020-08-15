package algorithm;

public class Element {
    public char operator;
    public int precedenta;

    public Element(char operator) {
        if (operator == 'x' || operator == '/') {
            this.operator = operator;
            this.precedenta = 3;
        } else if (operator == '+' || operator == '-') {
            this.operator = operator;
            this.precedenta = 2;
        } else if (operator == '(' || operator == ')') {
            this.operator = operator;
            this.precedenta = 4;
        }
    }

    public int compare(Element toCompare)
    {
        return precedenta - toCompare.precedenta;
    }

    public String toString()
    {
        return " "+operator+" ";
    }
}