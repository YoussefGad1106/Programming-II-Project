public class BookProduct extends Product {
    
    private String author ;
    private String publisher ;

        public BookProduct(int productId , String name , float price , String author , String publisher){
            super(productId, name, price) ; // invoking the super-class's constructor
            this.author = author ;
            this.publisher = publisher ;
        }
                // setters

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }
                // Getters
                
        public String getAuthor() {
            return author;
        }

        public String getPublisher() {
            return publisher;
        }

        
}
