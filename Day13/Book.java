public class Book{

    private String title;
    private String author;
    private double price;

    public void setTitle(String title){
        if(title !=null&& !title.trim().isEmpty()){
            this.title =title.trim();
        }else{
            System.out.println("Invalid Title.");
        }
    }

    public void setAuthor(String author){
        if(author !=null && !author.trim().isEmpty()){
            this.author =author.trim();
        }else{
            System.out.println("Invalid Author Name.");
        }

    }

    public void setPrice(double price){
        if(price >0){
            this.price=price;
        }else{
            System.out.println("Invalid Price.");
        }
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public static void main(String[] args) {

        Book b = new Book();

        b.setTitle("Killing Floor");
        b.setAuthor("        Lee Child            ");
        b.setPrice(399.99);

        System.out.println("Book Title Name : "+b.getTitle());
        System.out.println("Book Author Name : "+b.getAuthor());
        System.out.println("Book Price : "+b.getPrice());
        
    }
}