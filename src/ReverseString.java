import java.util.*;
class ReverseString {

    public static String FirstReverse(String str) {
        String newStr = "";
        for (int i = str.length() -1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}