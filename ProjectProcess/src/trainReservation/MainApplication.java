package trainReservation;

import trainReservation.Controller.ReservationController;

public class MainApplication {
	
	private static ReservationController reservationController =
			new ReservationController();
	
	public static void main(String[] args) {
		
		reservationController.reservation();
		
	}

}
