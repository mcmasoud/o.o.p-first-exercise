public abstract class product implements IDiscountable{
    private String name;
    private double price;
    public  static int counter=0;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public product(String name, double price) {
        this.name = name;
        this.price = price;
        counter=counter+1;
    }

    public product(String name) {
        this.name = name;
        this.price =0 ;
        counter=counter+1;
    }
    public static void displayProductCount() {
        System.out.println("number of products : " + counter);
    }

    public void displayInfo() {
        System.out.println("name" + name+"price" + price);
    }

    public double applyDiscount(double discount) {
        return this.price=(1-discount)*price;
    }
    }
