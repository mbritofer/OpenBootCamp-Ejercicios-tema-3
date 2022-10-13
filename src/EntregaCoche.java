public class EntregaCoche {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.numeros_puertas);
    }
    
}

class Coche {
    public int numeros_puertas = 2;
    
    public void AumentarPuertas(){
        this.numeros_puertas++;
    }
          
}