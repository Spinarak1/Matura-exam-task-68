import org.junit.Assert;
import org.junit.Test;

public class CzyAnagramTest {
    @Test
    public void test(){
        Assert.assertEquals(false, Main.czyAnagram("AAAAA", "AAAAB"));
        Assert.assertEquals(true, Main.czyAnagram("BBBBA", "BBBBA"));
        Assert.assertEquals(true, Main.czyAnagram("ABABABAB", "BABABABA"));
        Assert.assertEquals(true, Main.czyAnagram("JDA", "ADJ"));
        Assert.assertEquals(false, Main.czyAnagram("EEEEEEJ", "EEEEEJEJ"));

    }
    @Test
    public void ileAnagramowTest(){
        Para[] para = {new Para("BABABB", "BBBABA"),
                        new Para("AAAA", "AAAA"),
                        new Para("AHHAH", "AHHAH"),
                        new Para("BBABBABB", "BABBAB"),
                        new Para("BBAABB", "CCCCC")};
        Assert.assertEquals(4, Main.liczbaAnagramow(para));
    }
}
