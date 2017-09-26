public class HealthyBurger extends Burger {

    private String bunType;
    private String meatType;
    private HealthyAddons healthyBurgerAdditons;

    public HealthyBurger(String bunType1, String meatType1) {
        System.out.println("Healthy burgers must come with brown bread\n");

        this.bunType = "Brown";
        this.meatType = meatType1;
        this.healthyBurgerAdditons = new HealthyAddons();

        System.out.println("A new healthy burger with a " + bunType + " bun and " + meatType1 + " burger has been ordered\n");
    }

    @Override
    public void addAddon(String nameOfAddon1) {
        this.healthyBurgerAdditons.addAddon(nameOfAddon1);

    }

    @Override
    public double getBurgerPrice() {

        return super.baseBurgerPrice + healthyBurgerAdditons.calculateAdditons();

    }
}
