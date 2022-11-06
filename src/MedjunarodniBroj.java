import static java.lang.Integer.parseInt;

public class MedjunarodniBroj extends TelefonskiBroj{
    private String drzava;  //string drzava sadrzi kompletan pozivni broj za drzavu npr.: "+387"
    private String broj;

    private int rastavaBroja(String broj){
        int x = parseInt(broj);
        int suma = 0;
        while(x != 0){
            suma = x % 10;
            x = x / 10;
        }
        return suma;
    }

    public MedjunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return rastavaBroja(drzava);// + parseInt(grad.toString())*100000000+parseInt(broj)*1000000;
    }
}
