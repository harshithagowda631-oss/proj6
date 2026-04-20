public class palindrome {

        public static void main(String[] args) {

            int n = 123, r = 0, temp;

            temp = n;

            while (n > 0) {
                r = r * 10 + n % 10;
                n = n / 10;
            }

            if (temp == r)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }

