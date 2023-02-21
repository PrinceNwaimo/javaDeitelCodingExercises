package Chapter3;

/*(Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String), the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value. Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase. */
public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;


    public PetrolPurchase(String stationLocation, String petrolType,int quantityInLitres,double pricePerLitre,double percentageDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityInLitres = quantityInLitres;
        if(pricePerLitre > 0.00){
        this.pricePerLitre = pricePerLitre;}
        if(percentageDiscount >0.00){
        this.percentageDiscount = percentageDiscount;}
    }
    public void setStationLocation(String stationLocation){this.stationLocation = stationLocation;}
    public void setPetrolType(String petrolType){this.petrolType=petrolType;}
    public void setQuantityInLitres(int litres){this.quantityInLitres=litres;}

    public void setPricePerLitre(double price) {
        this.pricePerLitre = price;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public String getStationLocation(){
        return stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantityInLitres() {
        return quantityInLitres;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }


    public double getPurchaseAmount(){

        double purchaseAmount = (quantityInLitres * pricePerLitre)*percentageDiscount;
        double netPurchaseAmount= (quantityInLitres * pricePerLitre)-purchaseAmount;
        return netPurchaseAmount;

    }

    }

