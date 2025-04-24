public class Main {
    public static void main(String[] args) {
        product[] products = new product[5];
 products[0]= new DigitalProduct("apple",1200,41);
 products[1]= new DigitalProduct("nokia",500,42);
        products[2]= new DigitalProduct("xiaomi",700,70);
        products[3]= new PhysicalProduct("chair",750,800);
        products[4]= new PhysicalProduct("sofa",1500,9000);
        for (int i = 0; i < products.length; i++) {
        products[i].displayInfo();}
        System.out.println("----------------------------------------------");
        System.out.println("prices after discount :");
     System.out.println("\n"+products[0].getName()+": "+products[0].getPrice());
        System.out.println("\n"+products[1].getName()+": $"+products[1].applyDiscount(.10));
        System.out.println("\n"+products[2].getName()+": $"+products[2].applyDiscount(.20));
        System.out.println("\n"+products[3].getName()+": "+products[3].getPrice());
        System.out.println("\n"+products[4].getName()+": $"+products[4].applyDiscount(.15));
}}
