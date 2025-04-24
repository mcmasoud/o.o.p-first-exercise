
    class PhysicalProduct extends product {
        private double vazn;

        public PhysicalProduct(String name, double price, double vazn) {
            super(name,price);
            this.vazn = vazn;
        }

        @Override
        public void displayInfo() {
            System.out.println("Name: " + getName() +", Price: " + getPrice() +", Weight: " +vazn + " kg");
        }
        public double getWeight(){
            return vazn;
        }
    }
