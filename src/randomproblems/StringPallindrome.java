package randomproblems;

public class StringPallindrome {
    public static void main(String args[]) {
        String str = "mamam";

        System.out.println(helper(str));
    }

    private static boolean isPallindrome(int i, int j, String str) {
        if(i >= j) return true;

            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }


        return isPallindrome(i+1, j-1, str);
    }

    private static boolean helper(String a) {
        return isPallindrome(0, a.length()-1, a);
    }
}
