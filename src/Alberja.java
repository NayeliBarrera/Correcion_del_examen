public class Alberja extends  Vegetales{
    private String figura;
    private String color;
    public Alberja(String name, String color) {
        super(name, color);
    }

    public Alberja(String name, String color, String figura, String color1) {
        super(name, color);
        this.figura = figura;
        this.color = color1;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}

