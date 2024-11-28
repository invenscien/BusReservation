package busResv;
import java.text.ParseException;
import java.util.*;
public class BusDemo {
    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<>();



        buses.add(new Bus (1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));
        for(Bus b : buses){
            b.displayBusInfo();
        }


        int userOpt = 1;
        Scanner sc = new Scanner(System.in);
        while(userOpt ==1) {
            System.out.println("Enter 1 to 2 to exit");
            userOpt = sc.nextInt();
            if(userOpt==1){
               Booking booking = new Booking();
               if(booking.isAvailable(bookings,buses)){
                   bookings.add(booking);
                   System.out.println("your booking is confirmed");
               }
               else {
                   System.out.println("sorry, bus is full");
               }

            }
        }

    }
}
