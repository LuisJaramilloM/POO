// Definición de la clase Auto
public class Auto {
    // Atributos privados de la clase
    private String marca;
    private String modelo;
    private int año;

    // Constructor de la clase
    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Métodos 'getter' para obtener los valores de los atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    // Métodos 'setter' para establecer los valores de los atributos
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Método para mostrar la información del auto
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + " - Modelo: " + modelo + " - Año: " + año);
    }
}
