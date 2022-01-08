public class InvalidAgeException
{

    public void validate(int age)
    {
        if(age < 1 || age > 100){
            throw new ArithmeticException("Invalid age : Age is not to be less than 1 nor exceeds 100");
        }
    }
    public static void main(String[] args) {
        InvalidAgeException exception = new InvalidAgeException();
        try{
            exception.validate(180);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
