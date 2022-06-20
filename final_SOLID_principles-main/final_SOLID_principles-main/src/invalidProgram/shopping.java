package invalidProgram;

public class shopping
{
    public void buyProducts()
    {
        System.out.println("your buying products");
    }

    public void payments(int amount, String mode)
    {
        if (mode.equals("cash"))
        {
            System.out.println("yours willing to pay cash");
        }
        else if (mode.equals("debit card"))
        {
            System.out.println("your willing to pay through debit card");
        }
        //now if i want to add another payment mode gpay then

        // ...................#2.............................
        //now if i want to add another payment mode gpay then
        else if(mode.equals ("gpay"))
        {
            System.out.println("your will to use gpay to pay your cash");
        }
    }

    public void service()
    {
        System.out.println("for any kind of services reach out to customer care !");
        callOrChatService coc = new callOrChatService();
    }

    public void feedback()
    {
        System.out.println("your feedback matters a lot for our improvement!");
    }
}

//S - acc to this principle each class should have only single responsibility to do
//violation of srp