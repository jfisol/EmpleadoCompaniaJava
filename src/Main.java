import org.patitos.gt.Empleado;
import org.patitos.gt.Gerente;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Luis","Suarez","120145","Nueva Yerse",
                2500,15000);

        double remuneracion = ((Empleado)gerente).aumentaRemuneracion(5);

        //imprimir Información
        System.out.println(gerente);
        System.out.println("Aumento remuneracion = " +remuneracion);
        System.out.println("Nueva Remuneracion = " +(remuneracion+ gerente.getRemuneracion()));

    }
}