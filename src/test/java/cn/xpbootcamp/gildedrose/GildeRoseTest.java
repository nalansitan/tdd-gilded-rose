package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class GildeRoseTest {
    @Test
    public void should_return_4_when_given_sellin_10_quality_3(){
        GildeRose gr = new GildeRose(10,3);
        gr.oneMoreDay();
        Assert.assertEquals(4,gr.getQuality());
        Assert.assertEquals(9,gr.getSellIn());
    }
}
