package trainReservation.entity;

public class Seat {
	
	private int roomNumber;
	private String seatNumber;
	private boolean seatStatus;
	
	public Seat() {}

	public Seat(int roomNumber, String seatNumber, boolean seatStatus) {
		this.roomNumber = roomNumber;
		this.seatNumber = seatNumber;
		this.seatStatus = seatStatus;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public boolean isSeatStatus() {
		return seatStatus;
	}

	@Override
	public String toString() {
		return "Seat [roomNumber=" + roomNumber + ", seatNumber=" + seatNumber + ", seatStatus=" + seatStatus + "]";
	}
	
	
	
}
