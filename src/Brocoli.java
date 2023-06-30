public class Brocoli extends Vegetales{
    private String color;
    private String ancho;

    public Brocoli(String name, String color) {
        super(name, color);
    }
    public Brocoli(String name, String color, String color1, String ancho) {
        super(name, color);
        this.color = color1;
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }


}
