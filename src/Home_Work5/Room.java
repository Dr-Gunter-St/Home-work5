package Home_Work5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String cityName;
    private String hotelName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String cityName, String hotelName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.cityName = cityName;
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", cityName='" + cityName + '\'' +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }

    public Room(int price, int persons, String cityName, String hotelName) {
        this.price = price;
        this.persons = persons;
        this.cityName = cityName;
        this.hotelName = hotelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return cityName.equals(room.cityName);

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (int)id;
        result = 31 * result + persons;
        result = 31 * result + dateAvailableFrom.hashCode();
        result = 31 * result + cityName.hashCode();
        result = 31 * result + hotelName.hashCode();

        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
