public class ThrowDemo {
    public void eligibility (int age)
	{
		if (age < 18) {
			throw new ArithmeticException("Not eligible to drink or smoke or should not be able to purchase!!");
		}
        else{
            System.out.println("Enjoy ruining your healthy body!!");
        }
	}
    public static void main(String[] args)
	{
		ThrowDemo demo = new ThrowDemo();
		try {
			demo.eligibility(17);
		}catch(ArithmeticException error) {
			System.out.println("Exception message : "+error.getMessage());
		}

	}
}
