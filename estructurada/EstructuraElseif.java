package estructurada;

public class EstructuraElseif {
    public static void main(String[] args) {
        
        boolean esUnDiaDeClases = true;
        final String DIA = "Viernes";

        if (esUnDiaDeClases && DIA.equals("Lunes")){
            System.out.println("Hoy es " + DIA + " y no hay clases");
        }else if (!esUnDiaDeClases) {
            System.out.println("Hoy es " + DIA + " y no hay clases");
        
        } else {
            System.out.println("Hoy hay clases");

        }
    }
}
