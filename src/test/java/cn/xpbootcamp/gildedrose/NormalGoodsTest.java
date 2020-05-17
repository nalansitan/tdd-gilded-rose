package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class NormalGoodsTest {
    @Test
    public void should_return_19_when_given_sellin_10_quality_20(){
        GildeRose gr = new GildeRose(10,20);
        gr.oneMoreDay();
        Assert.assertEquals(19,gr.getQuality());
        Assert.assertEquals(9,gr.getSellIn());
    }

    @Test
    public void should_return_0_when_given_sellin_2_quality_0(){
        GildeRose gr = new GildeRose(2,0);
        gr.oneMoreDay();
        Assert.assertEquals(0,gr.getQuality());
        Assert.assertEquals(1,gr.getSellIn());
    }

    @Test
    public void should_return_5_when_given_sellin_3_quality_6(){
        GildeRose gr = new GildeRose(3,6);
        gr.oneMoreDay();
        Assert.assertEquals(5,gr.getQuality());
        Assert.assertEquals(2,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_3_quality_51(){
        GildeRose gr = new GildeRose(3,51);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(2,gr.getSellIn());
    }

    @Test
    public void should_return_4_when_given_sellin_0_quality_6(){
        GildeRose gr = new GildeRose(0,6);
        gr.oneMoreDay();
        Assert.assertEquals(4,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_4_when_given_sellin_minus_1_quality_6(){
        GildeRose gr = new GildeRose(-1,6);
        gr.oneMoreDay();
        Assert.assertEquals(4,gr.getQuality());
        Assert.assertEquals(-2,gr.getSellIn());
    }
}
