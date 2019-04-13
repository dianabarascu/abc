import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Order {

    private static final LocalDate today = LocalDate.now();
    private static final LocalDate yesterday = today.minus(Period.ofDays(1));
    private final int quantity =0;
    private final String item = "";
    private final Date date;


    public Order(Date date){

        this.date = date;
    }

    private String myToString(){
        return "s";
    }

    public  static void main (String[] args){
        System.out.println(yesterday);
    }

}
