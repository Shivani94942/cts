package interfaceprogram;
//Product class is now an abstract class
public class Product implements ProductInterface {
 
 private double regularPrice;
 
 /** Creates a new instance of Product */
 public Product(double regularPrice) {
     this.regularPrice = regularPrice;
 }

 // computeSalePrice() is now an abstract method
 @Override
 public double computeSalePrice() {
	return 0;
}

 @Override
 public double getRegularPrice() {
     return regularPrice;
 }

 @Override
 public void setRegularPrice(double regularPrice) {
     this.regularPrice = regularPrice;
 }
 
}