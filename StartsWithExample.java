public class StartsWithExample {
    public static void main(String[] args) {
     
        String str1 = "Hello, World!";
        String suffix1 = "World!";
        boolean result1 = str1.endsWith(suffix1);
        System.out.println("Example 1 - Result: " + result1); 

     
        String str2 = "Java Programming";
        String suffix2 = "Python";
        boolean result2 = str2.endsWith(suffix2);
        System.out.println("Example 2 - Result: " + result2); 
    }
}

