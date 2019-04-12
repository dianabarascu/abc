import java.util.Scanner;
import java.util.Stack;

public class Application2 {


    private static String getText() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = scanner.nextLine();
        return text;
    }

    public static void main(String[] args) {

        Stack<String> initialSTACK = new Stack<String>();
        Stack<String> finalSTACK = new Stack<String>();

        String[] stringSplit = getText().split(" ");

        for (String word : stringSplit) {
            initialSTACK.push(word);
        }
        System.out.println("Initial stack: "+ initialSTACK);

        while (initialSTACK.isEmpty() == false){

            finalSTACK.push(initialSTACK.pop());
        }
        System.out.println("Final stack:" + finalSTACK);


    }

}
