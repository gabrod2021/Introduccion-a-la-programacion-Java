public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Gabriela");
        String nombre=persona.getNombre();
        System.out.println("Nombre:" + nombre);

        persona.setEdad(58);
        int edad= persona.getEdad();
        System.out.println("Edad:" + edad);

        persona.setTelefono("11-3890-1830");
        String telefono=persona.getTelefono();
        System.out.println("Telefono:" + telefono);

    }
}

class Persona{
private int edad;
private String nombre;
private String telefono;

    public void setEdad(int edad){
    this.edad=edad;

   }
   public int getEdad(){
        return this.edad;
   }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;

    }

    public String getTelefono(){
        return this.telefono;
    }
}