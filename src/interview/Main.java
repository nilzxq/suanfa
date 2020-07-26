package interview;

/**
 * @Author nilzxq
 * @Date 2020-07-26 11:49
 */
import java.util.Scanner;

public class Main {

    public static void run(String s) {
        int n = s.length();
        if (n <= 2) {
            System.out.println(s);
        }
        char[] input = s.toCharArray();
        char[] output = new char[n];
        int j = 2;
        output[0] = input[0];
        output[1] = input[1];
        for (int i = j; i < n; i++) {
            char temp = input[i];
            if (temp == output[j-1]) {
                if (temp == output[j-2]) {
                    continue;
                } else if (j - 3 >= 0 && output[j-2] == output[j-3]) {
                    continue;
                } else {
                    output[j] = input[i];
                    j += 1;
                }
            } else {
                output[j] = input[i];
                j += 1;
            }

        }
        for (int i = 0; i < n; i++) {
            if (output[i] != '\0') {
                System.out.print(output[i]);
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String[] input = new String[n];
            for (int i = 0; i < n; i++) {
                input[i] = scanner.nextLine();
                run(input[i]);
            }
        }
    }
}


