public class HealthyAddons extends Additons {

    private boolean veganStuff;
    private boolean veganSauce;
    private static double veganStuffCost = 0;
    private static double veganSauceCost = 0;

    public HealthyAddons() {

        this.veganStuff = false;
        this.veganSauce = false;

    }

    public static void setHealthyPrices(double veganStuffCost1, double veganSauceCost1) {

        veganSauceCost = veganSauceCost1;
        veganStuffCost = veganStuffCost1;

        System.out.println("Prices for health addons have been set at:\n \n" +
                "Vegan Stuff : " + veganStuffCost1 + "\n" +
                "Vegan sauce : " + veganSauceCost1);


    }

    @Override
    public double calculateAdditons() {

        double totalAdditonsCost = 0;

        if (this.veganSauce)
            totalAdditonsCost = totalAdditonsCost + veganSauceCost;
        if (this.veganStuff)
            totalAdditonsCost = totalAdditonsCost + veganStuffCost;

        return super.calculateAdditons() + totalAdditonsCost;
    }

    @Override
    public void addAddon(String name) {


        if (name == "vegan stuff") {
            this.veganStuff = true;
            System.out.println("vegan stuff added");
        }
        if (name == "vegan sauce") {
            this.veganSauce = true;
            System.out.println("vegan sauce added");
        } else {
            super.addAddon(name);
        }

    }
}
