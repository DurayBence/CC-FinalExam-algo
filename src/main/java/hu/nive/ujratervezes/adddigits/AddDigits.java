package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.length() == 0) {
            return -1;
        }

        int result = 0;
        char[] inputChars = input.toCharArray();

        for (int i = 0; i < inputChars.length; i++) {
            try {
                result += Integer.parseInt("" + inputChars[i]);
            } catch (NumberFormatException exception) {
                //do nothing == go to next char
            }
        }

        return result;
    }

}
