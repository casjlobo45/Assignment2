public class PSL extends Product{
	//Constructor for PSL
	

	private String ticketCode;
	private double licenseFee;
	
		public PSL(String productCode, String productType, double licenseFee, String ticketCode){
			super(productCode, productType);
			this.ticketCode = ticketCode;
			this.licenseFee = licenseFee;
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
		
}
