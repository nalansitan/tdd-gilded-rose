package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class AgedBrieTest {
    @Test
    public void should_return_4_when_given_sellin_10_quality_3_good_type_aged_brie(){
        GildeRose gr = new GildeRose(10,3, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(4,gr.getQuality());
        Assert.assertEquals(9,gr.getSellIn());
    }

    @Test
    public void should_return_5_when_given_sellin_0_quality_3_good_type_aged_brie(){
        GildeRose gr = new GildeRose(0,3, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(5,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_0_quality_49_good_type_aged_brie(){
        GildeRose gr = new GildeRose(0,49, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_10_quality_50_good_type_aged_brie(){
        GildeRose gr = new GildeRose(10,50, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(9,gr.getSellIn());
    }
}
