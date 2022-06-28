public class TestClothes {
    public static void main(String[] args) {

        Clothes c = new Clothes(29.9,"T-Shirt","Medium");
        c.details();// not sout needed just the dot operator and name of the method and scan which is c and details.
        c.increasePrice();
        c.details();
        c.increasePrice(7);
        c.details();

        Clothes clt2 = new Clothes (31.2, "Jeans", "Small");

        clt2.details();
        clt2.increasePrice();
        clt2.increasePrice();
        clt2.details();
        clt2.increasePrice(4);
        clt2.details();

    }

}
