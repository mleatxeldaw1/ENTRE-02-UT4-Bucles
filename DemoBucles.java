import java.util.Random;
/**
 *    @author - 
 */
public class DemoBucles
{
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    private Random generador;
    /**
     * Constructor  
     */
    public DemoBucles()
    {
        generador = new Random();
    }

    /**
     * Calcular la mayor potencia de 2 que es menor o igual a numero
     * Asumimos numero > 0
     * 
     * Si numero = 7 devuelve 4             numero = 8 devuelve 8
     *    numero = 19 devuelve 16           numero = 32 devuelve 32
     *    numero = 74 devuelve 64           numero = 1 devuelve 1
     *    numero = 190 devuelve 128
     *    
     *  Usa bucles while
     */
    public int mayorPotencia2(int numero) {
        // Prueba 1
        // int potencia = 2;
        // int contador = 0;
        // int calculo = 0;
        // int resultado = 0;
        // int contadorprueba = 0;

        // while( calculo != numero || calculo < numero){
        // calculo = (int)Math.pow(potencia, contador);
        // contador++;
        // }

        // return calculo;

        //Prueba 2
        //limpiarPantalla();
        int contador = 1;
        int contador1 = 0;
        while (numero >= contador && numero != 1){
            contador1 = contador;
            contador *= 2;

        }
        return contador1;
    }

    /**
     * Escribir numero como suma de potencias de 2 
     * tal como indica el enunciado (Se asume numero > 0)
     * 
     * Todos los valores se muestran en pantalla fomateados a 6 posiciones 
     * y ajustados a la derecha
     * 
     * Hay que usar el método anterior - 
     * Utiliza bucles while
     * 
     *  77 =    64     8     4     1
     * 215 =   128    64    16     4     2     1
     *  18 =    16     2
     *  64 =    64
     */
    public void escribirSumaPotencias(int numero) {
        //limpiarPantalla();
        int potencia = mayorPotencia2(numero);
        System.out.format(numero + "=" +"%6d",  potencia);

        while (potencia > 1 && potencia !=1){
            // int raiz1 = (int)Math.sqrt(aux);
            int raiz1 = 0;
            int suma =0;
            suma = potencia;
            int aux = potencia;
            raiz1 = mayorPotencia2(aux-1);

            while (raiz1 > 0){
                if(suma + raiz1 <= numero){
                    if( raiz1==0){
                    } else {
                        System.out.format("%6d", raiz1);
                        aux = raiz1;
                        potencia = aux;
                        suma += raiz1;
                    }
                } 
                raiz1= mayorPotencia2(raiz1-1);
                potencia= raiz1;
                if( numero - suma ==1){
                    raiz1=1;
                }
            }
        }
    }

    /**
     * Generar aleatorios entre 0 y 255
     * y escribir cada aleatorio como suma de potencias de 2
     * Parar al salir el 255 o despues de generar n aleatorios
     * (ver enunciado)
     * 
     * Hay que usar el método anterior
     * 
     * Utiliza bucles while
     * 
     */
    public void generarAleatorios(int n) {
        int contador = 1;
        int aleatorio = generador.nextInt(256);
        System.out.println("Nºs aleatorios como suma de potencias de 2");
        while (contador <= n) {
            escribirSumaPotencias(aleatorio);
            contador++;
            aleatorio = generador.nextInt(256);
        }      
        System.out.println("Bucle terminado porque se han generado ya " + n + " aleatorios");
    }

    /**
     *  Escribe en pantalla caracter n veces en la misma línes
     *  
     *  Usa bucles for
     */
    public void escribirCaracter(int n, char caracter)
    {
        //limpiarPantalla();
        //Diferente prueba
        // for ( int contador = n-1; contador >=0; contador--){
        for ( int contador = 1; contador <=n; contador++){
            System.out.print(caracter);
        }
    }

    /**
     *  Genera la figura tal como muestra el enunciado 
     *  con ayuda del método anterior
     *  
     *   Usa bucles for
     */
    public  void mostrarEscalera(int escalones, int alto, int ancho) {
        limpiarPantalla();
        for (int contador = 0; contador <= escalones; contador++){
            int contador1 = 0;
            for(contador1 = 1; contador1 <= alto; contador1++){
                            escribirCaracter(ancho * contador, ESPACIO);
                escribirCaracter(ancho, ASTERISCO);
                System.out.println();
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void limpiarPantalla(){
        System.out.println("\u000c");
    }

}
