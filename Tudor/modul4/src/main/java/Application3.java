import java.util.Stack;

public class Application3 {


    public static void main(String[] args) {

        reverseStack();

        reverseString("Diana");
    }

    private static void reverseStack() {
        Stack<String> initialSTACK = new Stack<String>();
        Stack<String> finalSTACK = new Stack<String>();
        Stack<String> reverseSTACK = new Stack<String>();


        System.out.println(initialSTACK.push("Diana"));
        for (int i = 1; i < initialSTACK.toString().length() - 1; i++) {
            finalSTACK.push(String.valueOf(initialSTACK.toString().charAt(i)));
        }
        while (!finalSTACK.isEmpty()) {
            reverseSTACK.push(finalSTACK.pop());

        }

        System.out.println(reverseSTACK.toString());
    }

    public  static String reverseString(String toReverse) {

        char[] chars = toReverse.toCharArray();
        Stack<Character> reversedChars = new Stack<Character>();

        for (char c : chars) {
            reversedChars.push(c);
        }

        StringBuilder reversedWord = new StringBuilder(toReverse.length());

        while (!reversedChars.empty()) {
            reversedWord.append(reversedChars.pop());
        }

        System.out.println(reversedWord.toString());
        return reversedWord.toString();
    }

}
