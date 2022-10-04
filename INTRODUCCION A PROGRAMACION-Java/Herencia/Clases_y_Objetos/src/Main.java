public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Gabriela Rodriguez");
        String nombre=persona.getNombre();
        System.out.println("Nombre:" + nombre);

        persona.setEdad(58);
        int edad= persona.getEdad();
        System.out.println("Edad:" + edad);

        persona.setTelefono("11-3890-1830");
        String telefono=persona.getTelefono();
        System.out.println("Telefono:" + telefono);


        Cliente cliente = new Cliente();

        cliente.setNombre("Pablo Gonzalez");
        String nombre_cli= cliente.getNombre();
        System.out.println("Nombre del cliente:" + nombre_cli);

        cliente.setEdad(55);
        int edad_cli= cliente.getEdad();
        System.out.println("Edad del cliente:" + edad_cli);

        cliente.setTelefono("11-3450-8888");
        String telefonoCli=cliente.getTelefono();
        System.out.println("Telefono del cliente:" + telefonoCli);

        cliente.setCredito(350000);
        float credito=cliente.getCredito();
        System.out.println("El cliente tiene un credito de $ " + credito);

        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Juan Perez");
        String nombreTrabajador= trabajador.getNombre();
        System.out.println("Nombre del empleado:" + nombreTrabajador);

        trabajador.setEdad(35);
        int edadTrabajador= trabajador.getEdad();
        System.out.println("Edad del empleado:" + edadTrabajador);

        trabajador.setTelefono("11-6768-1122");
        String telefonoTrabaj=trabajador.getTelefono();
        System.out.println("Telefono del empleado:" + telefonoTrabaj);

        trabajador.setSalario(250000);
        float salario= trabajador.getSalario();
        System.out.println("El empleado gana $ " + salario);

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
class Cliente extends Persona{
    private float credito;
    public void setCredito(float credito) {
        this.credito = credito;
    }
    public float getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    private float salario;

    public void setSalario(float salario){
        this.salario=salario;
    }
    public float getSalario(){
        return this.salario;
    }
}