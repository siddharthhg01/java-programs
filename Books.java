import java.util.Scanner;
class Book{
String name,author;
int price,numPages;
Book(String name,String author,int price,int numPages){
this.name=name;
this.author=author;
this.price=price;
this.numPages=numPages;
}
String tostring(){
    String author,name,price,numPages;
    name="This Book is  "+this.name+"\n";
    author="Author is "+this.author+"\n";
    price="price ="+this.price+"\n";
    numPages="No of pages "+this.numPages+"\n";
    return name+author+price+numPages;
}
}

public class Books{
    public static void main(String[] args) {
        System.out.println("USN = 2023BMS02586 NAME = SANTHOSH S");
        Scanner s=new Scanner(System.in);
        int n,numPages,price;
        String name,author;
        System.out.println("Enter No of Books ");
        n=s.nextInt();
        Books arr[];
        arr=new Books[n];
        for(int i=0;i<n;i++){
            System.out.println(" Enter the name of Book ");
           name=s.next();
            System.out.println(" Enter the author of Book ");
           author=s.next();
            System.out.println("Enter the price of Book ");
           price=s.nextInt();
            System.out.println("Enter the no of pages of the Book ");
            numPages=s.nextInt();
            arr[i]=new Book(name,author,price,numPages);
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i].tostring());
        }
    }
}