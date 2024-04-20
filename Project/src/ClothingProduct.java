public class ClothingProduct extends Product {
    
    private String size ;
    private String fabric ;

        public ClothingProduct(int productId , String name , float price , String size , String fabric){
            super(productId, name, price); // invoking the super-class's constructor
            this.size = size ; 
            this.fabric =fabric ;
        }
            // setters

        public void setSize(String size) {
            this.size = size;
        }

        public void setFabric(String fabric) {
            this.fabric = fabric;
        }
            // Getters

        public String getSize() {
            return size;
        }

        public String getFabric() {
            return fabric;
        }

        
    
    
}
