public class Order {

    private int customerId ;
    private int orderId ;
    private Product products[] ;
    private float totalPrice ;

        public Order(int customerId , int orderId  ,Product[] product , float totalPrice) {
            
            this.customerId = Math.abs(customerId) ; // to be sure it is positive
            this.orderId = Math.abs(orderId) ; // to be sure it is positive
            this.products = product ;
            this.totalPrice = Math.abs(totalPrice) ; // to be sure it is positive
             
        }

       public void printOrderInfo(){
            System.out.println("Here's your order's summary :");
            System.out.println("Order ID : "+this.orderId);
            System.out.println("Customer ID : "+this.customerId);
            
              System.out.println("products : ");
            for (int i = 0; i < products.length; i++) { // print the name and the price of each product in the object array
                System.out.println(products[i].getName()+" - "+products[i].getPrice());
            }

             this.totalPrice = 0f ; // intialize it to be able to change its value
            for (int i = 0; i < products.length; i++) {
                this.totalPrice += products[i].getPrice() ;  // use the function getPrice to access the price of each product
            }

            System.out.println("Total price : $"+this.totalPrice);
           

       }
        
}
