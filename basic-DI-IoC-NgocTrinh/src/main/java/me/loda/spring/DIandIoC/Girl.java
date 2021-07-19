package me.loda.spring.DIandIoC;

public class Girl{
    private Outfit outfit;
    public Girl(Outfit anything, Accessories gucci, HairStyle hair){
        this.outfit = anything; // Tạo ra một cô gái, với một món đồ tùy biến
        // Không bị phụ thuộc quá nhiều vào thời điểm khởi tạo, hay code.
        this.outfit.wear();
    }
}

