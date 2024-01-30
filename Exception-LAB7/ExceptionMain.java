import java.util.Scanner;

class WrongAge extends Exception{
public WrongAge(String A){
    super(A);
}
}

class Father{
int fatherAge;
Scanner sc=new Scanner(System.in);
public void validAge() throws WrongAge{
System.out.println("Enter Fathers age");
fatherAge=sc.nextInt();
if(fatherAge<=0){
    throw new WrongAge("Invalid fathers age");
}
}
}

class Son extends Father{
int sonAge;
Scanner sc=new Scanner(System.in);
public void validAge() throws WrongAge{
    System.out.println("Enter sons age");
    sonAge=sc.nextInt();
    super.validAge();
    if (sonAge>=fatherAge) {
        throw new WrongAge("Sons age cant be greater than Fathers age");   
    }
    else if(sonAge<0){
        throw new WrongAge("Invalid son age");
    }
}

}

public class ExceptionMain{
    public static void main(String[] args) {
        Son obj = new Son();
        try{
            obj.validAge();
        }
        catch(WrongAge e){
            System.out.println("Exception "+e.getMessage());
        }
        
    }
}
