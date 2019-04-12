public class StringStack {

    private static final int MAX_SIZE = 10;
    private String[] stack = new String[MAX_SIZE];
    private int top = -1;

    String push (String value) {
        if (top == MAX_SIZE - 1) {
            return "Exiting";
        }
        top++;
        stack[top] = value;

        return value;
    }

    public String pop() {
        if (top < 0) {
            System.out.println("Exiting");
        }
        String val = stack[top];
        top = top - 1;
        return val;

    }

    public void reverseWords(String phrase){

        String[] stringSplit = phrase.split(" ");

        for (String word: stringSplit){
            push(word);
        }
        for (String word: stringSplit){
            System.out.print(pop()+ " ");
        }

    }





}
