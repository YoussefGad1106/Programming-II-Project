public class ElectronicProduct extends Product {
    private String brand ;
    private int warrantyPeriod ;

        public ElectronicProduct(int productId , String name , float price , String brand , int warrantyPeriod){
            super(productId, name, price);  // invoking the super-class's constructor
            this.brand = brand ;
            this.warrantyPeriod =warrantyPeriod ;
        }
            // setters 

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setWarrantyPeriod(int warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
        }
            // Getters

        public String getBrand() {
            return brand;
        }

        public int getWarrantyPeriod() {
            return warrantyPeriod;
        }

        
}
