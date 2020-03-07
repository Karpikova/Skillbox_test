import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.List;

public class AirportHandler {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        List<Aircraft> allAircrafts = airport.getAllAircrafts();
        System.out.println(allAircrafts.size());
    }
}
