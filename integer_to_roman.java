// question - https://leetcode.com/problems/integer-to-roman/description/?envType=study-plan-v2&envId=top-interview-150

public class integer_to_roman {
    public String intToRoman(int num) {
        // Create a StringBuilder to store the Roman numeral representation
        StringBuilder sb = new StringBuilder("");

        // Define arrays for thousands, hundreds, tens, and ones places in Roman
        // numerals
        String[] thousands = { "", "M", "MM", "MMM" };
        String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        // Append the Roman numeral representation for each place value to the
        // StringBuilder
        sb.append(thousands[num / 1000]);
        sb.append(hundreds[(num % 1000) / 100]);
        sb.append(tens[(num % 100) / 10]);
        sb.append(ones[num % 10]);

        // Return the final Roman numeral representation as a String
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example usage: Convert the integer 1984 to Roman numerals
        int num = 1984;
        integer_to_roman solution = new integer_to_roman();
        String romanNumeral = solution.intToRoman(num);

        // Display the result
        System.out.println("Roman numeral representation of " + num + " is: " + romanNumeral);
    }
}
