public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public float getInkAmount() {
        return inkAmount;
    }

    public void use() {
        inkAmount -= 50;
    }
}
