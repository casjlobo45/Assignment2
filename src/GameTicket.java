public class GameTicket extends Product{
	private String dateTime;
	private String team1;
	private String team2;
	private double pricePerUnit;
	private Venues venue;
	
	
	//Constructor for Game Ticket
	public GameTicket(String productCode, String productType, Venues venue, String dateTime, String team1, String team2, double pricePerUnit){
		super(productCode, productType);
		this.dateTime = dateTime;
		this.team1 = team1;
		this.team2 = team2;
		this.pricePerUnit = pricePerUnit;
		this.venue = venue;
	}



	public String getDateTime() {
		return dateTime;
	}



	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}



	public String getTeam1() {
		return team1;
	}



	public void setTeam1(String team1) {
		this.team1 = team1;
	}



	public String getTeam2() {
		return team2;
	}



	public void setTeam2(String team2) {
		this.team2 = team2;
	}



	public double getPricePerUnit() {
		return pricePerUnit;
	}



	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	
}
