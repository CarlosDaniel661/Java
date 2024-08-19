package estructurada;

class EstructuradaIf {

    public static void main(String[] args) {

        int topPuntaje = 100;

        if (topPuntaje < 100) {
            System.out.println("El valor del puntaje es: " + topPuntaje);
            
        }
        System.out.println("Fuera del If");

        int segundoPuntaje = 90;

        if (topPuntaje > segundoPuntaje && topPuntaje <= 100) {
            System.out.println("El valor de top puntaje es mayor al segundo puntaje y menor o igual a 100");

        }

        if (topPuntaje > 90 || segundoPuntaje < 70) {
            System.out.println("Top puntaje es mayor que 90 o segundo puntaje menor que 70")
        }
    }
}