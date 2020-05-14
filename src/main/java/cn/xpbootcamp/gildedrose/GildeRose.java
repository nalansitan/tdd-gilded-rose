package cn.xpbootcamp.gildedrose;

import static cn.xpbootcamp.gildedrose.GildeRose.GOODSTYPES.Normal;

public class GildeRose {
    private int SellIn;
    private int Quality;
    public enum GOODSTYPES{
        Sulfuras,
        Normal,
        AgedBrie;
    }
    public GOODSTYPES GoodsTypes = Normal;

    public GildeRose(int SellIn, int Quality) {
        this.Quality = Quality;
        this.SellIn = SellIn;
    }

    public GildeRose(int Quality, GOODSTYPES GoodsTypes) {
        this.Quality = Quality;
        this.GoodsTypes = GoodsTypes;
    }

    public GildeRose(int SellIn, int Quality, GOODSTYPES GoodsTypes) {
        this.Quality = Quality;
        this.SellIn = SellIn;
        this.GoodsTypes = GoodsTypes;
    }

    public int getQuality() {
        if (this.Quality < 0){
            this.Quality = 0;
        }else if (this.Quality > 50){
            this.Quality = 50;
        }
        return this.Quality;
    }

    public int getSellIn() {
        return this.SellIn;
    }

    public void oneMoreDay() {
        switch(this.GoodsTypes) {
            case Sulfuras:
                break;
            case AgedBrie:
            case Normal:
            default:
                this.SellIn -= 1;
                if (this.SellIn < 0){
                    this.Quality -= 2;
                }else{
                    this.Quality += 1;
                }
                break;
        }
    }
}
