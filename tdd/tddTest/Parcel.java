package tddTest;

public class Parcel {
    int bonus = 0;
    private int collectionRate;
    private int amount;

    public Parcel(int collectionRate){
        this.collectionRate = collectionRate;
        this.amount = amount;
    }
    public int getCollectionRate(){
        return collectionRate ;}
    public int getAmount(){
        if (collectionRate >= 50 && collectionRate <= 59) amount = 200;
        if (collectionRate >= 60 && collectionRate <= 69)amount = 250;
        if (collectionRate >= 70) amount = 500;
        return bonus = amount * collectionRate;
    }
    public void setCollectionRate(int collectionRate){
        this.collectionRate= collectionRate;
    }

}
