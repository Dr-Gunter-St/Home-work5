package Home_Work5;


import java.text.ParseException;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);
}
