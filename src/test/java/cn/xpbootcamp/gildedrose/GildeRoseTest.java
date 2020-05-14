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

    @Test
    public void should_return_1_when_given_sellin_0_quality_3(){
        GildeRose gr = new GildeRose(0,3);
        gr.oneMoreDay();
        Assert.assertEquals(1,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_0_when_given_sellin_0_quality_1(){
        GildeRose gr = new GildeRose(0,1);
        gr.oneMoreDay();
        Assert.assertEquals(0,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_10_quality_50(){
        GildeRose gr = new GildeRose(10,50);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(9,gr.getSellIn());
    }

    @Test
    public void should_return_10_when_given_sulfuras_quality_10(){
        GildeRose gr = new GildeRose(10, GildeRose.GOODSTYPES.Sulfuras);
        gr.oneMoreDay();
        Assert.assertEquals(10,gr.getQuality());
    }

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

    @Test
    public void should_return_4_when_given_sellin_12_quality_3_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(12,3, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(4,gr.getQuality());
        Assert.assertEquals(11,gr.getSellIn());
    }

    @Test
    public void should_return_5_when_given_sellin_9_quality_3_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(9,3, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(5,gr.getQuality());
        Assert.assertEquals(8,gr.getSellIn());
    }

    @Test
    public void should_return_6_when_given_sellin_4_quality_3_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(4,3, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(6,gr.getQuality());
        Assert.assertEquals(3,gr.getSellIn());
    }
}
