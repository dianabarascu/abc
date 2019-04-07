public class Queue {

    private static final int MAX_SIZE = 10;
    private int[] queue = new int[MAX_SIZE];

    int head = 0;
    int tail = -1;

    public void enqueue (int val){

        if(tail == MAX_SIZE-1){
            return;
        }
        tail++;
        queue[tail] = val;

    }


    public int deenqueue (){

        if(head>tail){
            System.out.println("No elements left, exiting");
        }

        int val = queue[head];
        head = head +1;
        return val;

    }

}
