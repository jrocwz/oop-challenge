public class Burger {

    private String bunType;
    private String meatType;
    private Additons burgerAdditons;
    public static double baseBurgerPrice;


    public Burger() {
    }

    public Burger(String bunType, String meatType) {
        this.bunType = bunType;
        this.meatType = meatType;
        this.burgerAdditons = new Additons();
        System.out.println("A " + this.getClass().getName() + " with a " + bunType + " bun and " + meatType + " has just been ordered\n");

    }

    public String getBunType() {
        return bunType;
    }

    public String getMeatType() {
        return meatType;
    }

    public static void setBaseBurgerPrice(double baseBurgerPrice1) {
        baseBurgerPrice = baseBurgerPrice1;
        System.out.println("The base price for a burger has been set at " + baseBurgerPrice1 + "\n");

    }

    public double getBurgerPrice() {
        double endPrice = getBaseBurgerPrice() + this.burgerAdditons.calculateAdditons();
        return endPrice;
    }

    public void addAddon(String nameOfAddon) {
        this.burgerAdditons.addAddon(nameOfAddon);
    }

    public static double getBaseBurgerPrice() {
        return baseBurgerPrice;
    }
}
