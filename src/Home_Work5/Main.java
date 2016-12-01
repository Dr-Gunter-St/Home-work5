package Home_Work5;

import java.util.Arrays;

public class Main {
    static Controller controller = new Controller();

    public static void main(String[] args) {
        Room[] rooms = controller.requestRooms(1000, 3, "Washington", "Empire");
        System.out.println(Arrays.toString(rooms));

        rooms = controller.requestRooms(650, 1, "Los Angeles", "California");
        System.out.println(Arrays.toString(rooms));

        rooms = controller.requestRooms(900, 3, "Miami", "Titan");
        System.out.println(Arrays.toString(rooms));

    }
}
