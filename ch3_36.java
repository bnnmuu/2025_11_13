public class ch3_36 {

    public static void main(String[] args) {
        String greeting = "Local";

        char firstChar = greeting.charAt(0);
        char secondChar = greeting.charAt(1);

        int length = greeting.length();

        System.out.println(greeting + " 的第一個字元是 " + firstChar);
        System.out.println(greeting + " 的第二個字元是 " + secondChar);
        System.out.println(greeting + " 的長度是 " + length);
    }
}