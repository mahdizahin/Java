

import java.lang.*;

public interface GuestInterface
{
	boolean insertGuest(Guest gst);
	boolean removeGuest(Guest gst);
	Guest searchGuest(double phnNum);
	void showAllGuests();

}