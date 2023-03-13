package trainReservation.entity;

import java.util.List;

// 기차 정보 Entity class

public class Train {
	private String trainNumber;
	private String departureStation;
	private String departureTime;
	private String arrivalStation;
	private String arrivalTime;
	private int takeMinute;
	private String type;
	private List<StopStation> stopStations;
	private List<Seat> seats;
	
	public Train() {}

	public Train(String trainNumber, String departureStation, String departureTime, String arrivalStation,
			String arrivalTime, int takeMinute, String type, List<StopStation> stopStations, List<Seat> seats) {
		super();
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.departureTime = departureTime;
		this.arrivalStation = arrivalStation;
		this.arrivalTime = arrivalTime;
		this.takeMinute = takeMinute;
		this.type = type;
		this.stopStations = stopStations;
		this.seats = seats;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public int getTakeMinute() {
		return takeMinute;
	}

	public String getType() {
		return type;
	}

	public List<StopStation> getStopStations() {
		return stopStations;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", departureStation=" + departureStation + ", departureTime="
				+ departureTime + ", arrivalStation=" + arrivalStation + ", arrivalTime=" + arrivalTime
				+ ", takeMinute=" + takeMinute + ", type=" + type + ", stopStations=" + stopStations + ", seats="
				+ seats + "]";
	}
	
	
	
}
