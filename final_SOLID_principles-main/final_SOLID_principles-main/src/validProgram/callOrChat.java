package validProgram;

public class callOrChat implements callOrChatService
{
    @Override
    public void callOrChat()
    {
        System.out.println("we are providing call and chat services. Feel free to reach out to us");
    }
}

//validating interface segregation principles
