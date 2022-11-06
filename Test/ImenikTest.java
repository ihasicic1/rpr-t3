import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    @BeforeAll
    public static void radiNesto(){
        TelefonskiBroj broj1 = new FiksniBroj(Grad.SARAJEVO,"543213");
        TelefonskiBroj broj2 = new FiksniBroj(Grad.SARAJEVO,"54623432");
    }

    @org.junit.jupiter.api.Test
    void dodaj() {
        Imenik imenik = new Imenik();
        TelefonskiBroj broj1 = new FiksniBroj(Grad.SARAJEVO,"543213");
        TelefonskiBroj broj2 = new FiksniBroj(Grad.SARAJEVO,"54623432");
        imenik.dodaj("Sumnjivo lice1",broj1);
        assertEquals(1,imenik.dajBrojBrojeva());
        imenik.dodaj("Lice 2",broj2);
        assertEquals(2,imenik.dajBrojBrojeva());
        assertThrows(IllegalArgumentException.class, ()->
            new FiksniBroj(Grad.SARAJEVO, "")
        );
    }
}