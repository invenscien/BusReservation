package busResv;
import jdk.dynalink.linker.support.SimpleLinkRequest;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of passenger :");
        passengerName = sc.next();
        System.out.println("enter bus no:");
        busNo = sc.nextInt();
        System.out.println("enter date dd-mm-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
        public boolean isAvailable (ArrayList < Booking > bookings, ArrayList < Bus > buses){
            int capacity = 0;
            for (Bus bus : buses) {
                if (bus.getBusNo() == busNo)
                    capacity = bus.getCapacity();
            }
            int booked = 0;
            for (Booking b : bookings) {
                if (b.busNo == busNo && b.date.equals(date)) {
                    booked++;
                }
            }
            return booked < capacity ? true : false;
        }
    }


