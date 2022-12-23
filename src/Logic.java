class Logic {

    static void testVariables(String input) throws WrongExpressionException {
        if (input.isEmpty()) {
            throw new WrongExpressionException();
        }

        String[] array = input.split(" ");
        if (array.length != 3) {
            throw new WrongExpressionException();
        }

        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(array[0]);
            b = Integer.parseInt(array[2]);
        } catch (NumberFormatException e) {
            throw new WrongExpressionException();
        }
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new WrongExpressionException();
        }

        String s = array[1];
        if (!(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))) {
            throw new WrongExpressionException();
        }
    }

    static int calculating(String[] expression) {
        int a = Integer.parseInt(expression[0]);
        int b = Integer.parseInt(expression[2]);
        int result = 0;

        switch (expression[1]) {
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
