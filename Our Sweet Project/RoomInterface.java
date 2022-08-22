
import java.lang.*;


public interface RoomInterface
{
	boolean addRoom(Room r);
	boolean removeRoom(Room r);
	Room searchRoom(String roomNumber);
	void showAllRooms();
}