package invalidProgram;

public class implementation
{
    public static void main(String[] args)
    {
        shopping s = new shopping();
        clothes c = new clothes();
        callOrChatService coc = new callOrChatService();
        s.buyProducts();
        c.menClothes();
        s.payments(1000,"cash");
        coc.callOrChat();

    }
}

//5 //Dip // here we see that high level model is directly dependent
//shopping and clothes classes



