package StringAddition;

public class StringAddition {

    public static String add(String addend1, String addend2) {
        StringBuilder rev_addend1 = new StringBuilder(addend1);
        StringBuilder rev_addend2 = new StringBuilder(addend2);
        rev_addend1.reverse();
        rev_addend2.reverse();
        int length1 = addend1.length();
        int length2 = addend2.length();

        // int long_length, short_length;
        StringBuilder rev_addend_long, rev_addend_short;
        if (length1 > length2) {
            rev_addend_long = rev_addend1;
            rev_addend_short = rev_addend2;
        } else {
            rev_addend_long = rev_addend2;
            rev_addend_short = rev_addend1;
        }

        StringBuilder rev_sum = new StringBuilder();
        int carry = 0;
        int a1, a2;
        for (int i = 0; i < rev_addend_long.length(); i++) {
            a1 = Integer.parseInt(rev_addend_long.substring(i, i + 1));
            if (i < rev_addend_short.length()) {
                a2 = Integer.parseInt(rev_addend_short.substring(i, i + 1));
            } else {
                a2 = 0;
            }
            // System.out.println("i = " + i + ", a1 = " + a1 + ", a2 = " + a2);

            int digit_sum = a1 + a2 + carry;
            if (digit_sum > 9) {
                carry = 1;
                digit_sum -= 10;
            } else {
                carry = 0;
            }
            rev_sum.append(digit_sum);
        }

        if (carry == 1) {
            rev_sum.append(1);
        }

        rev_sum.reverse();
        return (rev_sum.toString());
    }

    public static void main(String args[]) {
        System.out.println("Running StringAddition.");
    }
}