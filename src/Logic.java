import java.util.Arrays;

class Logic {

    private int a;
    private int b;
    private String s;


    void testVariables(String input) throws WrongExpressionException {
        if (input.isEmpty()) {
            throw new WrongExpressionException();
        }

        String[] array = input.split(" ");
        if (array.length != 3) {
            throw new WrongExpressionException();
        }

        try {
            this.a = Integer.parseInt(array[0]);
            this.b = Integer.parseInt(array[2]);
        } catch (NumberFormatException e) {
            throw new WrongExpressionException();
        }
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new WrongExpressionException();
        }

        this.s = array[1];
        if (!(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))) {
            throw new WrongExpressionException();
        }
    }

    public int calculating() {
        int result = 0;

        switch (s) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        return result;
    }


}
