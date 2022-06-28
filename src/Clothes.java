public class Clothes {

    double price;
    String type;
    String size;

    public Clothes(double price, String type, String size) {
        this.price = price;
        this.type = type;
        this.size = size;
    }

    public void increasePrice(){
        price = price + 5;
    }
    public void increasePrice(double price){ // make sure state the parameters' ex: int price or double price
        price = price + 5;
    }
    public void details(){
        System.out.println("Item:" + type);
        System.out.println("size:" + size);
        System.out.println("Item:" + price);
    }

}







