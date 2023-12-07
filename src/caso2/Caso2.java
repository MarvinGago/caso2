/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2;

/**
 *
 * @author CPUw1010
 */
public class Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear amigos
        Amigo guillermo = new Amigo("Guillermo");
        Amigo tavo = new Amigo("Tavo");
        Amigo david = new Amigo("David");
        Amigo greivin = new Amigo("Greivin");
        Amigo joshua = new Amigo("Joshua");
        Amigo andres = new Amigo("Andres");

        // Crear lista de movimientos
        Movimiento[] movimientos = new Movimiento[]{
                new Movimiento(tavo, 5),
                new Movimiento(david, 20),
                new Movimiento(greivin, -115),
                new Movimiento(joshua, 60),
                new Movimiento(andres, 60)
        };

        // Calcular deudas totales por persona
        for (Movimiento movimiento : movimientos) {
            movimiento.amigo.deuda += movimiento.monto;
        }

        // Mostrar deudas totales por persona
        for (Amigo amigo : new Amigo[]{guillermo, tavo, david, greivin, joshua, andres}) {
            System.out.println(amigo.nombre + ": " + amigo.deuda + " dolares");
        }
    }
}
    