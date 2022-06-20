package invalidProgram;

public class callOrChatService implements Services
{
    @Override
    public void callOrChat()
    {
        System.out.println("call or chat services available!");
    }

    @Override
    public void mailServices()
    {
        System.out.println("mail services not available");
    }
}

//.......................#4. - I ...........................
//violation Interface Segregation principle
