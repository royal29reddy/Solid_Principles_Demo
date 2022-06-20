package validProgram;

public class implementation {
    public static void main(String[] args) {
        Shopping s = new Shopping();
        s.buyProducts();

        payCash cash = new payCash();
        cash.paymentProcessing();

        callOrChat coc = new callOrChat();
        coc.callOrChat();

        feedBack fb = new feedBack();
        fb.feedback();
    }
}
