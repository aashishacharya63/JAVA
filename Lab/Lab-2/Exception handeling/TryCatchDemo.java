
public class TryCatchDemo {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 0;
        int result = 0;
        try{
            result = num1/num2;
            System.out.println("The output is :"+result);
        }catch(ArithmeticException e){
            System.out.println("Error message: "+ e.getMessage());
        }
    }
}
