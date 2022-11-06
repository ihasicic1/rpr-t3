import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        if(broj.isEmpty())throw new IllegalArgumentException("Belaj");
        this.grad = grad;
        this.broj = broj;
    }

    public Grad getGrad(){
        return grad;
    }

    @Override
    public String ispisi() {
        return grad.toString() +"/"+broj;
    }

    @Override
    public int hashCode() {
        return parseInt(grad.toString())*100000000+parseInt(broj)*1000000;
    }
}
