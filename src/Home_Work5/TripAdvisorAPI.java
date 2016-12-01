package Home_Work5;


public class TripAdvisorAPI implements API{

    public Room[] rooms;

    public TripAdvisorAPI() {
        this.rooms = new Room[5];
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.rooms[0] = new Room(234321354523L, 1000, 3, simpleDateFormat.parse("15-03-2016") , "Washington", "Empire");
        this.rooms[1] = new Room(245423212513L, 500, 1, simpleDateFormat.parse("17-04-2016") , "Los Angeles", "California");
        this.rooms[2] = new Room(435239042423L, 750, 2, simpleDateFormat.parse("21-11-2016") , "Pasadena", "Cloud9");
        this.rooms[3] = new Room(234321354523L, 1500, 4, simpleDateFormat.parse("05-05-2016") , "New York", "Continental");
        this.rooms[4] = new Room(234321354523L, 900, 3, simpleDateFormat.parse("01-07-2016") , "Miami", "Titan");*/

        this.rooms[0] = new Room(1250, 3, "Washington", "Empire");
        this.rooms[1] = new Room(650, 1, "Los Angeles", "California");
        this.rooms[2] = new Room(600, 2, "Pasadena", "Cloud9");
        this.rooms[3] = new Room(1750, 4, "New York", "Continental");
        this.rooms[4] = new Room(650, 3, "Miami", "Titan");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel){
        Room[] match;
        Room room = new Room(price, persons, city, hotel);
        int count = 0;

        for (int i = 0; i < 5; i++){
            if (rooms[i].equals(room)){
                count++;
            }
        }

        match = new Room[count];
        count = 0;

        for (int i = 0; i < 5; i++){
            if (rooms[i].equals(room)){
                match[count] = room;
                count++;
            }
        }

        return match;
    }
}
