// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Auto
        Auto miAuto = new Auto("Toyota", "Corolla", 2020);

        // Uso de métodos 'getter' y 'setter'
        miAuto.setMarca("Honda");
        miAuto.setModelo("Civic");
        miAuto.setAño(2022);

        // Mostrar la información del auto
        miAuto.mostrarInformacion();
    }
}
