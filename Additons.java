public class Additons {

    private boolean tomatoes;
    private static double tomatoesCost = 0;
    private boolean cheese;
    private static double cheeseCost = 0;
    private boolean bacon;
    private static double baconCost = 0;
    private boolean onions;
    private static double onionCost = 0;
    private boolean chips;
    private boolean drink;
    private static double chipsCost = 0;
    private static double drinkCost = 0;


    public Additons() {


        this.tomatoes = false;
        this.cheese = false;
        this.bacon = false;
        this.onions = false;
        this.chips = false;
        this.drink = false;


    }

    public static void setPrices(double tomatoesCost1, double cheeseCost1, double baconCost1, double onionCost1,
                                 double chipsCost1, double drinkCost1) {

        System.out.println("Prices for addons have been set at:\n\n" +
                "Tomatoes : " + tomatoesCost1 + "\n" +
                "Cheese   : " + cheeseCost1 + "\n" +
                "Bacon    : " + baconCost1 + "\n" +
                "Onion    : " + onionCost1 + "\n" +
                "Chips    : " + chipsCost1 + "\n" +
                "Drink    : " + drinkCost1);
        tomatoesCost = tomatoesCost1;
        cheeseCost = cheeseCost1;
        baconCost = baconCost1;
        onionCost = onionCost1;
        chipsCost = chipsCost1;
        drinkCost = drinkCost1;
    }

    public double calculateAdditons() {


        double totalAdditonsCost = 0;


        if (this.drink)
            totalAdditonsCost = totalAdditonsCost + drinkCost;
        if (this.chips)
            totalAdditonsCost = totalAdditonsCost + chipsCost;
        if (this.cheese)
            totalAdditonsCost = totalAdditonsCost + cheeseCost;
        if (this.bacon)
            totalAdditonsCost = totalAdditonsCost + baconCost;
        if (this.tomatoes)
            totalAdditonsCost = totalAdditonsCost + tomatoesCost;
        if (this.onions)
            totalAdditonsCost = totalAdditonsCost + onionCost;

        return totalAdditonsCost;


    }

    public void addAddon(String name) {
        if (name == "tomatoes") {
            this.tomatoes = true;
            System.out.println("tomatoes added");
        }
        if (name == "cheese") {
            this.cheese = true;
            System.out.println("cheese added");
        }
        if (name == "bacon") {
            this.bacon = true;
            System.out.println("bacon added");
        }
        if (name == "onions") {
            System.out.println("onions added");
            this.onions = true;
        }
        if (name == "chips") {
            System.out.println("chips added");
            this.chips = true;
        }
        if (name == "drink") {
            System.out.println("drink added");
            this.drink = true;
        }
    }
}
