package cn.xpbootcamp.gildedrose;

public class GildeRose {
    public GildeRose(int SellIn, int Quality) {
        this.Quality = Quality;
        this.SellIn = SellIn;
    }

    private int SellIn;
    private int Quality;

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
        this.SellIn -= 1;
        if (this.SellIn < 0){
            this.Quality -= 2;
        }else{
            this.Quality += 1;
        }
    }
}
