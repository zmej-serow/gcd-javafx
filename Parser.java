package OlkaGCD;

public class Parser {

    /**
     * Validate input. If textfield is valid, return null.
     * If not -- return description of problem.
     * Correct input string contain two or more numbers separated by any amount of non-digit symbols.
     */
    public static String validator(String textField) {
        String onlyDigits = textField.replaceAll("\\D+", " ");
        onlyDigits = onlyDigits.replaceAll("^\\s", "");
        String[] numbers = onlyDigits.split(" ");
        if (numbers.length > 1) {
            return null;
        }
        return "О да, детка, пиши ещё!";
    }

    /**
     * Convert validated textfield to array of int
     */
    public static int[] getInputValues(String textField) {
        String onlyDigits = textField.replaceAll("\\D+", " ");
        String[] numbers = onlyDigits.split(" ");
        int[] digits = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) digits[i] = Integer.parseInt(numbers[i]);
        return digits;
    }

}
