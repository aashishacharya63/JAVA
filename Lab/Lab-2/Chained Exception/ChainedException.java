
public class ChainedException {
    public static void main (String args[])throws Exception { 
        int number = 20, result = 0;
        try { 
            result = number/0;
            System.out.println("The result is "+result);
        } catch(ArithmeticException error1) { 
            System.out.println ("Arithmetic exception occoured: "+error1);
            try { 
                throw new NumberFormatException();
            } catch(NumberFormatException error2) {
                System.out.println ("Chained exception thrown manually : "+error2);
            }
        }
    }
}
