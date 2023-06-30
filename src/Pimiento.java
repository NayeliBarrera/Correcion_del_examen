public class Pimiento extends Vegetales {
    private double largo;
    private double ancho;
    private String tamanio;
    public Pimiento(String name, String color) {
        super(name, color);
    }

    public Pimiento(String name, String color, double largo, double ancho, String tamanio) {
        super(name, color);
        this.largo = largo;
        this.ancho = ancho;
        this.tamanio = tamanio;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
