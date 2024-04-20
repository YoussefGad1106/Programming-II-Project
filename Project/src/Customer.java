public class Customer {
    
    private int customerId ;
    private String name ;
    private String address ;

        public Customer(int customerId , String name , String address){
            
            this.customerId = Math.abs(customerId) ;  // to be sure it is positive
            this.name = name ;
            this.address =address ;
        }

        public void setCustomerId(int customerId) {
            this.customerId = Math.abs(customerId); // to be sure it is positive
        }
            // setters

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }
            // Getters
            
        public int getCustomerId() {
            return customerId;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        
}
