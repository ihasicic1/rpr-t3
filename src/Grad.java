public enum Grad {
    SARAJEVO("033"), ZENICA("032"), TUZLA("035"),MOSTAR("4"), ŠIROKI_BRIJEG("039"),
    GORAŽDE("038"), BIHAĆ("037"), LIVNO("034"), TRAVNIK("030"), ORAŠJE("031"), BRCKO("");

    private final String pozivni;

    Grad(String pozivni) {
        this.pozivni = pozivni;
    }

    @Override
    public String toString() {
        return pozivni;
    }
}
