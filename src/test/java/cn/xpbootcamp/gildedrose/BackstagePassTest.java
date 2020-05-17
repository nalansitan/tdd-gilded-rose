package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class BackstagePassTest {
    @Test
    public void should_return_21_when_given_sellin_15_quality_20_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(15,20, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(21,gr.getQuality());
        Assert.assertEquals(14,gr.getSellIn());
    }

    @Test
    public void should_return_47_when_given_sellin_10_quality_45_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(10,45, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(47,gr.getQuality());
        Assert.assertEquals(9,gr.getSellIn());
    }

    @Test
    public void should_return_47_when_given_sellin_9_quality_45_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(9,45, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(47,gr.getQuality());
        Assert.assertEquals(8,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_10_quality_49_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(10,49, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(9,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_10_quality_50_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(10,50, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(9,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_5_quality_49_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(5,49, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(4,gr.getSellIn());
    }

    @Test
    public void should_return_48_when_given_sellin_5_quality_45_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(5,45, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(48,gr.getQuality());
        Assert.assertEquals(4,gr.getSellIn());
    }

    @Test
    public void should_return_23_when_given_sellin_1_quality_20_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(1,20, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(23,gr.getQuality());
        Assert.assertEquals(0,gr.getSellIn());
    }

    @Test
    public void should_return_0_when_given_sellin_0_quality_20_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(0,20, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(0,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }
}
