public class MobilniBroj extends TelefonskiBroj{


    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        if(broj.isEmpty())throw new IllegalArgumentException("Belaj");
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }


    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
