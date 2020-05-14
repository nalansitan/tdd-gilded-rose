package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class BackstagePassTest {
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

    @Test
    public void should_return_0_when_given_sellin_0_quality_3_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(0,3, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(0,gr.getQuality());
        Assert.assertEquals(-1,gr.getSellIn());
    }

    @Test
    public void should_return_50_when_given_sellin_3_quality_49_good_type_backstage_pass(){
        GildeRose gr = new GildeRose(3,49, GildeRose.GOODSTYPES.BackstagePass);
        gr.oneMoreDay();
        Assert.assertEquals(50,gr.getQuality());
        Assert.assertEquals(2,gr.getSellIn());
    }
}
