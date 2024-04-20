public class Product {
    
    protected int productId;
    protected String name ;
    protected float price ;

        public Product(int productId , String name , float price ){
            this.productId = Math.abs(productId); // to be sure it is positive
            this.name = name ;
            this.price = Math.abs(price); // to be sure it is positive
        }
                // setters

        public void setProductId(int productId) {
            this.productId = Math.abs(productId); // to be sure it is positive
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(float price) {
            this.price = Math.abs(price); // to be sure it is positive
        }

            // Getters

        public int getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public float getPrice() {
            return price;
        }

        
}
