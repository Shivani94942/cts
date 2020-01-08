package interfaceprogram;

//Electronics class is now an abstract class because
//it does not provide implementation of the
//computeSalePrice() abstract method.
public class Electronics extends Product implements ElectronicInterface{
 
 private String manufacturer;
 
 /** Creates a new instance of Electronics */
 public Electronics(double regularPrice,
         String manufacturer) {
    super(regularPrice);
     this.manufacturer = manufacturer;
 }
 
 public String getManufacturer() {
     return manufacturer;
 }
 
 public void setManufacturer(String manufacturer) {
     this.manufacturer = manufacturer;
 }


}

	
 