package example.Exchange;

// 화폐: 화폐 = 환율
public class ExchangeRate {
	
	// 넣을 화폐 (ex. 원화, 달러, 엔화, 위와화 ... )
	private String exchangingCurrency;
	
	// 바꿀 화폐 (ex. 원화, 달러, 엔화, 위와화 ... )
	private String exchangedCurrency;
	
	// 환율 (1,000 / 1,316.30)
	private double exchangeRate;
	
	public ExchangeRate(String exchangingCurrency, String exchangedCurrency, double exchangeRate) {
		this.exchangingCurrency = exchangingCurrency;
		this.exchangedCurrency = exchangedCurrency;
		this.exchangeRate = exchangeRate;
	}

	// Get메서드
	// 인스턴스가 가지고 있는 특정 인스턴스 변수의 값을 반환해주기 위한 메서드
	
	public String getExchangingCurrency() {
		return this.exchangingCurrency;
	}
	

	public String getExchangedCurrency() {
		return this.exchangedCurrency;
	}
	
	public double getExchangeRate() {
		return this.exchangeRate;
	}
	
	// Set 메서드
	// 인스턴스가 가지고 있는 특정 인스턴스 변수를 변경할 때 사용하는 메서드
	public void setExchangingCurrency(String exchangingCurrency) {
		this.exchangedCurrency = exchangingCurrency;
	}
	
	public void setExchangedCurrency(String exchangedCurrency) {
		this.exchangedCurrency = exchangedCurrency;
	}
	
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}
