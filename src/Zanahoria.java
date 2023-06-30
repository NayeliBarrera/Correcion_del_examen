public class Zanahoria  extends Vegetales{
    private String tamanio;
    private double altura;
    public Zanahoria(String name, String color) {
        super(name, color);
    }
    public Zanahoria(String name, String color, String tamanio, double altura) {
        super(name, color);
        this.tamanio = tamanio;
        this.altura = altura;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
