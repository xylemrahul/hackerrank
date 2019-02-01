package hackerrank.xylemraj.mmt.hackerrank.strings;

public class StrongPassword {

    public static void main(String[] args) {

        minimumNumber(4, "goxg");
    }

    static int minimumNumber(int n, String password) {
        String lower_case = ".*[a-z]+.*";
        String upper_case = ".*[A-Z]+.*";
        String numbers = ".*[0-9]+.*";
        String special_characters = ".*[-!@#$%^&*()+]+.*";

        int result = 0;

        if (!(password.matches(numbers))) {
            result++;
        }
        if (!(password.matches(lower_case))) {
            result++;
        }
        if (!(password.matches(upper_case))) {
            result++;
        }
        if (!(password.matches(special_characters))) {
            result++;
        }
        if (n < 6) {
            n = (6 - n);
            if (n > result) {
                result = n;
            }
        }
        return result;
    }

}
