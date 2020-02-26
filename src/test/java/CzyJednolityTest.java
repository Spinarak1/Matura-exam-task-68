import org.junit.Assert;
import org.junit.Test;

public class CzyJednolityTest {
    @Test
    public void test(){
        Assert.assertEquals(true, Main.czyJednolity("AAAA"));
        Assert.assertEquals(false, Main.czyJednolity("ABAA"));
        Assert.assertEquals(false, Main.czyJednolity("ADDA"));
        Assert.assertEquals(true, Main.czyJednolity("YY"));
        Assert.assertEquals(false, Main.czyJednolity("AAAAAAAAAAAAAAAW"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyStringException(){
        Main.czyJednolity("");
    }
    @Test
    public void zad681Test(){
        Para[] para = {new Para("aaa", "aaa"),
                        new Para("bab", "bba"),
                        new Para("aaaab", "aaaab"),
                        new Para("xd", "dx"),
                        new Para("popopop", "opopopop"),
                        new Para("wwwwww", "wwwwww")};
        Assert.assertEquals(2, Main.zad681(para));

    }
}
