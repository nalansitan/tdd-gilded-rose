package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class AgedBrieTest {
    @Test
    public void should_return_1_when_given_sellin_2_quality_0_good_type_aged_brie(){
        GildeRose gr = new GildeRose(2,0, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(1,gr.getQuality());
        Assert.assertEquals(1,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_2_quality_49_good_type_aged_brie(){
        GildeRose gr = new GildeRose(2,49, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(1,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_2_quality_50_good_type_aged_brie(){
        GildeRose gr = new GildeRose(2,50, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(1,gr.getSellIn());
    }

    @Test
    public void should_return_22_when_given_sellin_0_quality_20_good_type_aged_brie(){
        GildeRose gr = new GildeRose(0,20, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(22,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_22_when_given_sellin_minus_1_quality_20_good_type_aged_brie(){
        GildeRose gr = new GildeRose(-1,20, GildeRose.GOODSTYPES.AgedBrie);
        gr.oneMoreDay();
        Assert.assertEquals(22,gr.getQuality());
        Assert.assertEquals(-2,gr.getSellIn());
    }
}
