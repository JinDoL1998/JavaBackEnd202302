package trainReservation.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostReservationDto {
	
	private String trainNumber;
	private List<String> seats;
	
	public PostReservationDto(int numberOfPeople) {
		
		Scanner scanner = new Scanner(System.in);
		this.seats = new ArrayList<>();
		
		while (true) {
			
			System.out.println("탑승할 열차 번호 : ");
			this.trainNumber = scanner.nextLine();
			
			if(this.trainNumber.isBlank()) {
				System.out.println("열차 번호를 입력하세요");
				continue;
			}
			break;
		}
		
		while(this.seats.size() < numberOfPeople) {
			System.out.println("좌석 번호 : ");
			String seat = scanner.nextLine();
			
			if(seat.isBlank()) {
				System.out.println("좌석 번호를 입력하세요");
				continue;
			}
			this.seats.add(seat);
		}
		
	}

	public PostReservationDto(String trainNumber, List<String> seats) {
		this.trainNumber = trainNumber;
		this.seats = seats;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public List<String> getSeats() {
		return seats;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public void setSeats(List<String> seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "PostReservationDto [trainNumber=" + trainNumber + ", seats=" + seats + "]";
	}
	
	public boolean isEqualTrainNumber(String trainNumber) {
		return this.trainNumber.equals(trainNumber);
	}
	
	
}
