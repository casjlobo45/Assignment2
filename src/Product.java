/*
 * Product Class
 * CSCE 156
 * Assignment 2-6
 * Austin Baade
 * Carlos Sandoval
 * 
 * 
 * This class is the constructor for the product object.
 */



public class Product {

	//variables for Game-Tickets , season-passes, parking-passes, psl's, refreshments
	private String productCode;
	private String productType;
	private String venueCode;
	private String dateTime;
	private String team1;
	private String team2;
	private double pricePerUnit;
	private String team;
	private String startDate;
	private String endDate;
	private double cost;
	private double hourlyFee;
	private String ticketCode;
	private double licenseFee;
	private String name;

	//Constructor for Game Ticket
	public Product( String productCode, String productType, String venueCode, String dateTime, String team1, String team2, double pricePerUnit){
		this.productCode = productCode;
		this.productType = productType;
		this.venueCode = venueCode;
		this.dateTime = dateTime;
		this.team1 = team1;
		this.team2 = team2;
		this.pricePerUnit = pricePerUnit;
	}
	
	//Constructor for season-passes
	public Product(String productCode, String productType, String team, String startDate, String endDate, double cost){
		this.productCode = productCode;
		this.productType = productType;
		this.team = team;
		this.startDate = startDate;
		this.endDate = endDate;
		this.cost = cost;
	}
			
	//Constructor for parking-pass
	public Product(String productCode, String productType, String venueCode, double hourlyFee){
		this.productCode = productCode;
		this.productType = productType;
		this.venueCode = venueCode;
		this.hourlyFee = hourlyFee;
	}
	
	//Constructor for PSL
	public Product(double licenseFee, String productType, String ticketCode, String productCode){
		this.productCode = productCode;
		this.productType = productType;
		this.ticketCode = ticketCode;
		this.licenseFee = licenseFee;
	}
	
	//Constructor for Refreshments
	public Product(String name, double cost, String productType, String productCode){
		this.productCode = productCode;
		this.productType = productType;
		this.name = name;
		this.cost = cost;
	}

	
	//Getters and Setter:
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getVenueCode() {
		return venueCode;
	}

	public void setVenueCode(String venueCode) {
		this.venueCode = venueCode;
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getHourlyFee() {
		return hourlyFee;
	}

	public void setHourlyFee(double hourlyFee) {
		this.hourlyFee = hourlyFee;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public double getLicenseFee() {
		return licenseFee;
	}

	public void setLicenseFee(double licenseFee) {
		this.licenseFee = licenseFee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
