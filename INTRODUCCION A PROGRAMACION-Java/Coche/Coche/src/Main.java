public class Main {
    public static void main(String[] args) {
        Coche miCoche= new Coche();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.cant_puertas);
    }
}

class Coche{
    public int cant_puertas = 0;
    public void AgregarPuertas(){
    this.cant_puertas++;
    }
}