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
    for(int i=0;i<5;i++){
        System.out.println("\n"+products[i].getName()+": $"+products[i].applyDiscount(.15));
}}}