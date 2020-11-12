import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Xabier Ruiz Melero
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
     public static boolean estaEnOctal(int n) {
        int division = n / 10;
        int resto = n % 10;
        while (division != 0){
            if (resto >= 8){
                return false;
            }
            resto = division % 10;
            division /= 10;
        }
        if (resto >= 8){
            return false;
        }
        return true;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int cifras = 0;
        while (n != 0){
            cifras++;
            n = n / 10;
        }
        return cifras;
    }
}