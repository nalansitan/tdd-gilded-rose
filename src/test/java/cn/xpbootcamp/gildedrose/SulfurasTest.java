package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class SulfurasTest {
    @Test
    public void should_return_10_when_given_sulfuras_quality_10(){
        GildeRose gr = new GildeRose(10, GildeRose.GOODSTYPES.Sulfuras);
        gr.oneMoreDay();
        Assert.assertEquals(10,gr.getQuality());
    }
}
