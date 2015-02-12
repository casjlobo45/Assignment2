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
	protected static String productCode;
	protected static String productType;

	
	public Product(String productCode, String productType){
		this.productCode = productCode;
		this.productType = productType;
	}


	public static String getProductCode() {
		return productCode;
	}


	public static void setProductCode(String productCode) {
		Product.productCode = productCode;
	}


	public static String getProductType() {
		return productType;
	}


	public static void setProductType(String productType) {
		Product.productType = productType;
	}
	
	
	
}

