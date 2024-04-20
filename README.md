** E-Commerce System

This project implements a simple E-Commerce system that models different types of products and their interactions with customers.

**Classes

1. Product Class
   - Superclass representing a generic product.
   - Attributes:
     * productId: positive integer
     * name: String
     * price: positive float
   - Methods: Setters and getters for the attributes.

2. ElectronicProduct Class
   - Subclass of Product representing electronic products.
   - Attributes:
     * brand: String
     * warrantyPeriod: positive integer
   - Methods: Setters and getters for the attributes.

3. ClothingProduct Class
   - Subclass of Product representing clothing products.
   - Attributes:
     * size: String
     * fabric: String
   - Methods: Setters and getters for the attributes.

4. BookProduct Class
   - Subclass of Product representing book products.
   - Attributes:
     * author: String
     * publisher: String
   - Methods: Setters and getters for the attributes.

5. Customer Class
   - Represents a customer.
   - Attributes:
     * customerId: positive integer
     * name: String
     * address: String
   - Methods: Setters and getters for the attributes.

6. Cart Class
   - Represents a shopping cart.
   - Attributes:
     * customerId: positive integer
     * nProducts: positive integer
     * products: an array of Product objects of size nProducts
   - Methods: Setters and getters for the attributes, addProduct, removeProduct, calculatePrice, and placeOrder.

7. Order Class
   - Represents an order placed by a customer.
   - Attributes:
     * customerId: positive integer
     * orderId: positive integer
     * products: an array of Product objects
     * totalPrice: positive float
   - Methods: printOrderInfo.

8. EcommerceSystem Class
   - Entry point for the project. Contains the main method and demonstrates the usage of other classes. Creates products and takes orders from the user.

 **Test Case

1. Create an electronic product with specifications provided.
2. Create a clothing product with specifications provided.
3. Create a book product with specifications provided.
4. Create a customer with user's data.
5. Create a shopping cart for the customer and add products.
6. Ask the user if they want to place an order for the products in the cart.
7. Print order info.

Functionality:

   1)Product Creation:
Users can create different product types (Electronic, Clothing, Book) with specific attributes.
Input validation ensures positive values for price, warranty period, and number of products.
   2)Customer Creation:
Users enter their details to create a customer object.
   3)Shopping Cart Management:
Customers can add and remove products from their cart.
The system calculates the total price for all items in the cart.
   4)Order Placement:
Users confirm if they want to proceed with the order.
If confirmed, an Order object is created with customer information, product details, and total price.
   5)Order Information:
The printOrderInfo method displays a summary of the placed order.
