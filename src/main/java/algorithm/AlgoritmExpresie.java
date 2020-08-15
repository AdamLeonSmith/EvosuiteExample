package algorithm;

import javax.swing.JTextArea;
import java.util.StringTokenizer;
import java.util.Stack;

public class AlgoritmExpresie {
    public static void CalculeazaExpresia(JTextArea Input, JTextArea Output) {
        try{
        MyStack stiva = new MyStack();
        String input = Input.getText();

        for (int i = 1; i < input.length(); i++) {
            if (operator(input.charAt(i))) {
                input = input.substring(0, i) + " " + input.charAt(i) + " " + input.substring(i + 1);
                i++;
            }
        }
        String output = "";
        int i = 0;
        System.out.println(input);
        if (input.charAt(0) == '-'||input.charAt(0) == '+') {
            i = 1;
            output+=input.charAt(0);
        }
        for (; i < input.length(); i++) {
            if (verify(input.charAt(i))) {
                if (stiva.stackIsNotEmpty()) {
                    if (stiva.peek().compare(new Element(input.charAt(i))) < 0) {
                        stiva.push(input.charAt(i));
                    } else if (stiva.peek().compare(new Element(input.charAt(i))) >= 0) {
                        if (stiva.peek().operator != '(') {
                            output += stiva.pop();
                            stiva.push(input.charAt(i));
                        } else
                            stiva.push(input.charAt(i));
                    } else {
                        output += stiva.pop();
                    }
                } else
                    stiva.push(input.charAt(i));

            } else if (input.charAt(i) == ')') {
                while (stiva.stackIsNotEmpty() && stiva.peek().operator != '(')
                    output += stiva.pop();
                if (stiva.stackIsNotEmpty())
                    stiva.pop();

            } else
                output += input.charAt(i);

        }
        while (stiva.stackIsNotEmpty())
            output += stiva.pop();
        System.out.println(output);
        Stack<Double> stivaDouble = new Stack<Double>();
        StringTokenizer toCompute = new StringTokenizer(output, " ");
        double value = 0;
        while (toCompute.hasMoreTokens()) {
            String token = toCompute.nextToken();
            if (!token.equals("+") && !token.equals("-") && !token.equals("x") && !token.equals("/")) {
                Double toAdd = Double.parseDouble(token);
                stivaDouble.push(toAdd);
            } else if (token.equals("+")) {
                Double sum = stivaDouble.pop() + stivaDouble.pop();
                stivaDouble.push(sum);
                value = sum;
            } else if (token.equals("-")) {
                Double el1 = stivaDouble.pop();
                Double el2 = stivaDouble.pop();
                Double imp = el2 - el1;
                stivaDouble.push(imp);
                value = imp;

            } else if (token.equals("x")) {
                Double prod = stivaDouble.pop() * stivaDouble.pop();
                stivaDouble.push(prod);
                value = prod;
            } else if (token.equals("/")) {
                Double el1 = stivaDouble.pop();
                Double el2 = stivaDouble.pop();
                Double imp = el2 / el1;
                stivaDouble.push(imp);
                value = imp;

            }
        }
        Output.setText("" + value);
        
    }catch(Exception e)
    {
        Input.setText("Invalid Input");
    }
    }

    public static boolean verify(char operator) {
        return ((operator == '+') || (operator == '-') || (operator == '/') || (operator == 'x') || (operator == '('));
    }

    public static boolean operator(char operator) {
        return ((operator == '+') || (operator == '-') || (operator == '/') || (operator == 'x'));
    }
}