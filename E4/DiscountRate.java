package E4;

public class DiscountRate {

    private static double serviceDiscountPremium;
    private static double serviceDiscountGold;
    private static double serviceDiscountSilver;
    private static double productDiscountPremium;
    private static double productDiscountGold;
    private static double productDiscountSilver;


    public static double getServiceDiscountRate(String type) {
        if(type.toUpperCase().equals("PREMIUM")) {
            return serviceDiscountPremium; } else
                if (type.toUpperCase().equals("GOLD")){
            return serviceDiscountGold;
        } else if (type.toUpperCase().equals("SILVER")){
            return serviceDiscountSilver;
        }
        return 0.0;
    }

    public static double getProductDiscountRate(String type) {
        if(type.toUpperCase().equals("PREMIUM")) {
            return productDiscountPremium; } else
                if (type.toUpperCase().equals("GOLD")){
            return productDiscountGold;
        } else if (type.toUpperCase().equals("SILVER")){
            return productDiscountSilver;        }
        return 0.0;
    }


}
