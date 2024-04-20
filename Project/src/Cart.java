import java.util.Scanner;

public class Cart {
   
    private int customerId ;
    private int nProducts ;
    public Product products[] ;

    
        public Cart(int customerId , int nProducts){
            this.customerId = Math.abs(customerId) ; // to be sure it is positive
            this.nProducts =Math.abs(nProducts) ; // to be sure it is positive
            this.products =new Product[nProducts];  // object array to store the products
        }

                // setters

        public void setCustomerId(int customerId) {
            this.customerId = Math.abs(customerId); // to be sure it is positive
        }

        public void setnProducts(int nProducts) {
            this.nProducts = Math.abs(nProducts); // to be sure it is positive
        }
                // Getters

        public int getCustomerId() {
            return customerId;
        }

        public int getnProducts() {
            return nProducts;
        }

        public void addProduct(Product obj,int index){  // method to add objects to the object array of products
            
            if (index >= 0 && index < nProducts) {  // check the existence of the desired index
                products[index] = obj;
            }
                 
        }

        public void removeProduct(int index){   // method to remove objects from the object array of products

            if (index >= 0 && index < nProducts) { // check the existence of the desired index
                products[index] = null;  // assign the value to be null 
            }
        }

        public float calculatePrice(){ // get the total price of the objects in the array
              
                float total = 0f ;
                for (int i = 0; i < products.length; i++) {
                    total += products[i].getPrice() ; // use the function getPrice with each object in the array
                }
            return total ;    
        }

        public boolean placeOrder(){ // method to check whether to confirm the order or remove it
           
            System.out.println("your total is $"+calculatePrice()+". Would you like to place the order? 1-Yes 2-No"); 
           
             Scanner scanner = new Scanner(System.in);
                    int choice = scanner.nextInt();
                        if (choice == 1) // means confirm the order 
                        {
                            return true ;
                        }
                            
                        else    // means cancel the order the emptys the cart
                        {
                            return false ;
                        }
        
        }

        

}
