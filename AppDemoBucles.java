import java.util.Scanner;
/**
 *  @author - Mitxel leache
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{
    // private static Scanner teclado;
    // private DemoBucles db;
    // /**
    // * An example of a method - replace this comment with your own
    // *
    // * @param  y  a sample parameter for a method
    // * @return    the sum of x and y
    // */
    // public AppDemoBucles()
    // {
    // Scanner teclado = new Scanner(System.in);
    // }

    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    public static void main(String[] args)
    {
        int maxima = 1;
        Utilidades.borrarPantalla();
        while(maxima == 1){
            Scanner teclado = new Scanner(System.in); 
            DemoBucles db = new DemoBucles();
            System.out.print(" cantidad tope  máxima de aleatorios a generar ");
            maxima = teclado.nextInt();
            while(maxima < 10 || maxima > 15){
                maxima = teclado.nextInt();
            }
            db.escribirSumaPotencias(maxima);
            Utilidades.hacerPausa();
            Utilidades.borrarPantalla();
            // pa probar db.mostrarEscalera(10, 10, 10);
            db.mostrarEscalera(6, 4, 12);
            System.out.print("Si quieres empezar de nuevo pulsa 1, si no pulsa 0");
            
            maxima = teclado.nextInt();
            if ( maxima != 1 && maxima != 0){
                System.out.print("bn");
            }
        }
    }
}

