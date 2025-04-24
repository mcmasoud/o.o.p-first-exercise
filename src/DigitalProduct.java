public class  DigitalProduct extends product{
    private double fileSize;

    public DigitalProduct(String productname, double price, double fileSize) {
        super(productname, price);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName() +" Price: " + getPrice() +" File Size: " + fileSize);
    }
}


