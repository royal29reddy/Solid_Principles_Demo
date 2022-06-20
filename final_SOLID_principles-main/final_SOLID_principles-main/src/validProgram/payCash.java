package validProgram;

public class payCash implements payment
{
    @Override
    public void paymentProcessing()
    {
        System.out.println("paying via cash");
    }
}
// validating open close #2