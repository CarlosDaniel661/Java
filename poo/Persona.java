package poo;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;

    //Relaciones:
    private Auto auto;


    //Constructor vacio
    public Persona() {}

    //Constructor completo:
    public Persona(String nombre, String apellido, int dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
    //Como se escribe un método
    //[clasificador] [tipoDeRetorno] nombreDelMetodo([expresiones]){}

    public void setNombre(String nombre){
        //this es una forma de apuntar a atributos y metodos de la clase
        boolean esNombreValido = validarNombre(nombre);

        if (esNombreValido) {
            this.nombre = nombre;
        }else{
            System.out.println("Nombre no válido");
        }
        
    }
    private boolean validarNombre(String nombre){
        if (nombre == null || nombre.length() == 0){
            return false;
        }
            return true;
        
    }
    public void setApellido(String apellido){
        this.apellido = apellido;

    }
    public void setEdad(int edad){
        this.edad = edad;

    }
    public void setDni(int dni){
        this.dni = dni;

    }
    public void setAuto(Auto auto){
        this.auto = auto;
    }

    //Getters para devolver información
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getEdad(){
        return this.edad;
        
    }

    public int getDni() {
        return this.dni;
    }

    public Auto getAuto(){
        return this.auto;
    }

}
