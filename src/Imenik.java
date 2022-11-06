import java.util.*;

public class Imenik {

    private Map<String, TelefonskiBroj> imenik = new HashMap<>();

    public int dajBrojBrojeva(){
        return imenik.size();
    }
    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime,broj);
    }
    public String dajBroj(String ime){

        return imenik.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj)throws NepostojanjeBrojaUImeniku{
        for(Map.Entry<String, TelefonskiBroj> info: imenik.entrySet()){
            if(broj.equals(info.getValue()))return info.getKey();
        }
        throw new NepostojanjeBrojaUImeniku("Dati broj ne postoji u imeniku");
    }
    public String naSlovo(char s){
        String s1 = "";
        int brojac = 1;
        for(Map.Entry<String, TelefonskiBroj> info: imenik.entrySet()){
            if(info.getKey().charAt(0) == s) {
                s1 = s1 + brojac + "." + " " + info.getKey() + " - " + info.getValue() + "\n";
                brojac++;
            }
        }
        return s1;
    }

    Set<String> izGrada(Grad g){
        Set<String> skup = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> info: imenik.entrySet()){
            if(info.getValue() instanceof FiksniBroj){
                if(g.toString().equals(((FiksniBroj)info.getValue()).getGrad().toString())){
                    skup.add(info.getKey());
                }
            }
        }
        return skup;
    }

    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        //lambda funkcija, c1 i c2 su dva telefonska broja koja se porede
        Set<TelefonskiBroj> skup = new TreeSet<>(Comparator.comparing(TelefonskiBroj::ispisi));
        for(Map.Entry<String, TelefonskiBroj> info: imenik.entrySet()){
            if(info.getValue() instanceof FiksniBroj){
                if(g.toString().equals(((FiksniBroj)info.getValue()).getGrad().toString())){
                    skup.add(info.getValue());
                }
            }
        }
        return skup;
    }
}
