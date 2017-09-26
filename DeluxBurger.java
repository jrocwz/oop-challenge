public class DeluxBurger extends Burger {

    // private Additons burgerAdditons;

    public DeluxBurger(String bunType, String meatType) {
        super(bunType, meatType);
        super.addAddon("drink");
        super.addAddon("chips");
        System.out.println("A Delux burger has been ordered\n");


    }

    @Override
    public void addAddon(String nameOfAddon) {


        System.out.println("Sorry you are unable to add any extras to a Delux burger\n");

    }


}
