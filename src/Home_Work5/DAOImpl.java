package Home_Work5;

public class DAOImpl implements  DAO{

    @Override
    public Room save(Room room) {
        System.out.println("Room " + room + " saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room " + room + " is deleting");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room " + room + " updeted");
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }
}
