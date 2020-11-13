import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Xabier Ruiz Melero
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        Pantalla.borrarPantalla();
        System.out.println("Introduce un número: ");
        int num1 = teclado.nextInt();
        
        while (Utilidades.estaEnOctal(num1) != true){
            System.out.println("El número no está en OCTAL, introduce otro: ");
            num1 = teclado.nextInt();
        }
        System.out.println("Introduce otro número: ");
        int num2 = teclado.nextInt();
        while (Utilidades.estaEnOctal(num2) != true){
            System.out.println("El número no está en OCTAL, introduce otro: ");
            num2 = teclado.nextInt();
        }

        if (Utilidades.contarCifras(num1) != Utilidades.contarCifras(num2)){
            System.out.println("Los números no tienen las mismas cifras");
            hacerSumasOctales();
        }
        
        if ((Utilidades.contarCifras(num1) == Utilidades.contarCifras(num2)) && 
             Utilidades.estaEnOctal(num1) == true && Utilidades.estaEnOctal(num2) == true){
            int calculo = calculadora.sumarEnOctal(num1, num2);
            System.out.println("El resultado de la operación es: " + calculo);
        }
        
        String pregunta = String.format("Deseas volver a usar la calculadora?");
        if (pregunta == "S" || pregunta == "s"){
            hacerSumasOctales();
        }
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("Introduce un valor de altura");
        int altura = teclado.nextInt();
        while (altura < 1 && altura > 10){
            System.out.println("¡Error! Introduce un valor de altura correcto");
            altura = teclado.nextInt(); 
        }
    }
}