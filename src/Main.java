import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String word = sc.nextLine();
            if (word.length() > 10) {
                sb.append(word.charAt(0)).append(word.length() - 2).append(word.charAt(word.length() - 1)).append("\n");
            } else {
                sb.append(word).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
