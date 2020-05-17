package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class SulfurasTest {
    @Test
    public void should_return_45_when_given_sulfuras_sellin_0_quality_45(){
        GildeRose gr = new GildeRose(0,45, GildeRose.GOODSTYPES.Sulfuras);
        gr.oneMoreDay();
        Assert.assertEquals(45,gr.getQuality());
        Assert.assertEquals(0,gr.getSellIn());
    }

    @Test
    public void should_return_45_when_given_sulfuras_sellin_minus_1_quality_45(){
        GildeRose gr = new GildeRose(-1,45, GildeRose.GOODSTYPES.Sulfuras);
        gr.oneMoreDay();
        Assert.assertEquals(45,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sulfuras_sellin_minus_1_quality_50(){
        GildeRose gr = new GildeRose(-1,50, GildeRose.GOODSTYPES.Sulfuras);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_1_when_given_sulfuras_sellin_minus_1_quality_1(){
        GildeRose gr = new GildeRose(-1,1, GildeRose.GOODSTYPES.Sulfuras);
        gr.oneMoreDay();
        Assert.assertEquals(1,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_1_when_given_sulfuras_sellin_minus_2_quality_1(){
        GildeRose gr = new GildeRose(-2,1, GildeRose.GOODSTYPES.Sulfuras);
        gr.oneMoreDay();
        Assert.assertEquals(1,gr.getQuality());
        Assert.assertEquals(-2,gr.getSellIn());
    }
}
