
public class Refreshments extends Product{
	
	private double cost;
	private String name;
	//Constructor for Refreshments
		public Refreshments(String productCode, String productType, String name, double cost){
			super(productCode, productType);
			this.name = name;
			this.cost = cost;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
