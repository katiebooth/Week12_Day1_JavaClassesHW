import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void hasEnoughPaper(){
        printer.print(4,5);
        assertEquals(80,printer.getSheetsRemaining());
    }

    @Test
    public void doesNotHaveEnoughPaper(){
        printer.print(50,5);
        assertEquals(100,printer.getSheetsRemaining());
    }

    @Test
    public void tonerVolumeHasEnoughPaper(){
        printer.print(4,5);
        assertEquals(46,printer.getTonerVolume());
    }

    @Test
    public void tonerVolumeDoesNotHaveEnoughPaper(){
        printer.print(50,5);
        assertEquals(50,printer.getTonerVolume());
    }
}
