package vehicles;

import javax.naming.InvalidNameException;

public class vehicle {

	public static void main(String[] args) {
		char[] st = new char[3];
		land  lv = new land();
		Water wv = new Water();
		air   av = new air();
		
		
		lv.speed("Car");
		lv.isRunning("Car");
		lv.speed("Bus");
		lv.isRunning("Bus");
		
		wv.speed("Boat");
		wv.isRunning("Boat");
		wv.speed("Ship");
		wv.isRunning("Ship");

		av.speed("Aeroplane");
		av.isRunning("Aeroplane");
		av.speed("Helicopter");
		av.isRunning("Helicopter");
		
		try {
			System.out.println("Land vehicle " + st[0] + st[1] + st[2] + st[3] );
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid NAme: " + ex);
		}
	}

}
