package trainReservation.entity;

// 비용 Entity Class

public class Cost {
	
	private String departureSation;
	private String arrivalStation;
	private int amount;
	
	public Cost() {}

	public Cost(String departureStation, String arrivalStation, int amount) {
		this.departureSation = departureStation;
		this.arrivalStation = arrivalStation;
		this.amount = amount;
	}

	
	public String getDepartureStation() {
		return this.departureSation;
	}
	
	public String getArrivalStation() {
		return this.arrivalStation;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public String toString() {
		return "Cost [departureStation: " + this.departureSation + ", arrivalStation: " + this.arrivalStation + 
				", amount: " + this.amount + "]";
	}
	
}
