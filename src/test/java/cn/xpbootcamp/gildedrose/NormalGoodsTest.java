package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class NormalGoodsTest {
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
}
