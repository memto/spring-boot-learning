package me.loda.spring.DIandIoC;

public class Main {
    public static void main(String[] args) {
//        Outfit bikini = new Bikini(); // Tạo ra đối tượng Bikini ở ngoài đối tượng
//        Girl ngocTrinh = new Girl(bikini); // Mặc nó vào cho cô gái khi tạo ra cô ấy.

        Outfit bikini = new Bikini();
        Accessories gucci = new GucciAccessories();
        HairStyle hair = new KoreanHairStyle();

        Girl ngocTrinh = new Girl(bikini, gucci, hair);
    }
}