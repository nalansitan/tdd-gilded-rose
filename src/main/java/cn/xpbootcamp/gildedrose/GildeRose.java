package cn.xpbootcamp.gildedrose;

public class GildeRose {
    public GildeRose(int SellIn, int Quality) {
        this.Quality = Quality;
        this.SellIn = SellIn;
    }

    private int SellIn;
    private int Quality;

    public int getQuality() {
        return this.Quality;
    }

    public int getSellIn() {
        return this.SellIn;
    }

    public void oneMoreDay() {
        this.SellIn -= 1;
        this.Quality += 1;
    }
}
