public class Main {


    public static void main (String args[])
    {
        //TEST SECTION

        DeluxBurger liveTutorial = new DeluxBurger("Asisan Sesame","Lemongrass beef");


        //TEST OUTPUT SECTION
        //***************************************************************************************************************
        System.out.println("\n");
        System.out.println("*************************************************************************");
        System.out.println("\n");
        Burger.setBaseBurgerPrice(3.50);
        System.out.println("*************************************************************************");
        System.out.println("\n");
        Additons.setPrices(0.50,1.00,1.25,0.50,2.00,2.00);
        System.out.println("\n");
        System.out.println("*************************************************************************");
        System.out.println("\n");
        HealthyAddons.setHealthyPrices(1.00,1.00);
        System.out.println("\n");
        System.out.println("*************************************************************************");
        //*************************************************************************************************************
        System.out.println("\n");
        System.out.println("The price for your transaction is "+liveTutorial.getBurgerPrice()+" thank you and have a good day");
        System.out.println("\n");
        System.out.println("*************************************************************************");


    }





}
