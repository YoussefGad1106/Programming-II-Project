import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Creating the first object (Electronic product)
        ElectronicProduct product_1 = new ElectronicProduct(1, "smartphone",  599.99f, "samsung", 1);

        // Creating the second object (Clothing product)
        ClothingProduct product_2 = new ClothingProduct(2, "T-shirt",  19.99f, "Medium", "Cotton");
        
        // Creating the third object (Book product)
        BookProduct product_3 = new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications");
        
        System.out.println("please enter your id"); // taking the customer ID
        int customerId = input.nextInt() ;  

        input.nextLine();   // clean the \n which stored in the buffer
        
        System.out.println("please enter your name ");  // taking the customer name
        String name = input.nextLine() ;

        System.out.println("please enter your address");    // taking the customer address
        String address = input.nextLine() ;

        Customer customer = new Customer(customerId, name, address) ;   // create a customer object with the data entered by the user

        System.out.print("How many products you want to add to your cart ? ");  
        int numberOfProducts = input.nextInt() ;    // take the amount of the products to be the size of the array


        Cart cart = new Cart(customerId, Math.abs(numberOfProducts)); // Create a cart object with unique customer id and certain amount of products

        for (int i = 0; i < Math.abs(numberOfProducts); i++) { // take the order from the customer and storing the products in the array
               
            System.out.println("Which product you would like to add ? 1-Smartphone 2-T-shirt 3-OOP");
            int choice = input.nextInt();

                
            switch (Math.abs(choice)) {
                case 1:
                        
                    cart.addProduct(product_1, i);
                        break;

                case 2 :
                    
                    cart.addProduct(product_2, i);
                    break;

                case 3 :
                
                    cart.addProduct(product_3, i);    
                    break;
                     
                default :
                    System.out.println("invalid input");
                    break ;    
            }
        
        }
                
        if(cart.calculatePrice() == 0) // if the total price is 0 that means that the cart is empty
        {
             System.out.println("The cart is empty");
        }

        else
        {
                    
            boolean confirmation = cart.placeOrder();  // check the state of the confirmation of the order
             
             
            if (confirmation)   // if confirm == true --> save the order and print its details
            {
                Order order = new Order(customerId, 1, cart.products, cart.calculatePrice()) ;

                order.printOrderInfo();
                    
            }   
                            
            else    // if confirm == false --> cancel the order and empty the array
            {
                for (int i = 0; i < numberOfProducts; i++) {
                            
                    cart.removeProduct(i);
                }
                     
                System.out.println("The order has been cancelled.");    
                    
            }    
                
        }

    }

                  
}                   
    


