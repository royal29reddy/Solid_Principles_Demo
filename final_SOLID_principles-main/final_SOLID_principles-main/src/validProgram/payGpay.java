package validProgram;

public class payGpay implements payment
{

    @Override
    public void paymentProcessing()
    {
        System.out.println("paying through gpay");
    }
}
