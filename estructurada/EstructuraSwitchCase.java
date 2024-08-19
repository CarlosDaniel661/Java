package estructurada;

public class EstructuraSwitchCase {
    public static void main(String[] args) {
        

        int calificacion1 = 10;
        int calificacion2 = 5;
        String mensaje;
        
        int division = (calificacion1 + calificacion2) / 2;
        System.out.println("Valor: " + division);


        switch (division) {
            case 1:
                mensaje = "Desaprobaste";                
                break;
            case 2:
                mensaje = "Desaprobaste";                
                break;

            case 3:
                mensaje = "Desaprobaste";                
                break;

            case 4:
                mensaje = "Desaprobaste";                
                break;

            case 5:
                mensaje = "Desaprobaste";                
                break;

            case 6:
                mensaje = "Aprobaste";                
                break;

            case 7:
                mensaje = "Aprobaste";                
                break;

            case 8:
                mensaje = "Aprobaste";                
                break;

            case 9:
                mensaje = "Aprobaste";                
                break;

            case 10:
                mensaje = "Aprobaste";                
                break;
        
            default:
                mensaje = "Valor no válido";                
                break;
                
        }
        System.out.println(mensaje);
    }
}
