package Home_Work5;


public class Controller extends DAOImpl{
    private API[] apis;;

    public Controller(){
        apis = new API[3];
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new GoogleAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){
        Room[] google = apis[2].findRooms(price, persons, city, hotel);
        Room[] booking = apis[0].findRooms(price, persons, city, hotel);
        Room[] trip = apis[1].findRooms(price, persons, city, hotel);

        int count = google.length + trip.length + booking.length;
        Room[] match = new Room[count];

        for (int i = 0; i < count; i++){
            if (i<google.length){
                match[i] = google[i];
            } else if (i < google.length + booking.length){
                match[i] = booking[i-google.length];
            } else {
                match[i] = trip[i-google.length-booking.length];
            }
        }

        return match;
    }

    //public Room[] check(API api1, API api2) Method is impossible to create with what we have. I don`n want to write loads of code just to make a useless method
}
