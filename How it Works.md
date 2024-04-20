This project is a simple E-Commerce system that models different types of products and their interactions with customers. The project consists of the following classes:

1-Product: This is the superclass that represents a generic product and contains the coomon details of the products as the productId and the productName and also its price .

2-ElectronicProduct: This is a subclass of Product that represents electronic products. and it also represents the brand of the product and the warranty period of it.

3-ClothingProduct: This is a subclass of Product that represents clothing products. and it shows the size of the product and also shows frm which fabric is the product made.

4-BookProduct: This is a subclass of Product that represents book products. and demonstrates the author of the book and the publisher as well

5-Customer: This class represents a customer and indicates its information such as : the id , the name and also the address.

6-Cart: This class represents a shopping cart. and this class also contains the customerId to link it with the order and in this class we ask the user about the amount of the products 
        will be entered into the cart and take this number to be the size of the object array whic in each index in it we assign an object which represent a product. 
        and we also have methods to manipulate and deal with this array by adding new products to it or remove from it and we have a method called calculatePrice which calculates
        the sum of the prices of the products in the cart ( object array ) and finally we have got a function called placeOrder which shows the total price of the products
        in the cart and asks the user to whether confirm the order or cancel it and empty the cart.

7-Order: This class represents an order placed by a customer. this function has got 2 unique values which are the CustomerId and the OrderId as they are only specialized with
         this order and changes from one order to another and contains the object array of the products (cart) and also contains the total price of the products in the array
         and all of this are considered as the order information and the function of this class to print these information using PrintOrderInfo method.

8-8. EcommerceSystem: This class serves as the entry point for the project. It contains the main method and demonstrates the usage of the other classes. in this class
                      we Create an electronic producta , Create a clothing product and also a book product then Create a customer data: (take it as input from the user)
                      and then Create a shopping cart for the customer you created and ask them how many products they want to order and what they are and add them in the cart.
                      and in the last step we Ask the user if they want to place an order for the products in the cart. and finally we print the order information.

and this how our Simple E-commerce System works !!
