
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Xabier Ruiz Melero
 * 
 */
public class CalculadoraOctal
{
    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int contador = 0;
        int sumarCifras = 0;
        int resultado = 0;
        while (n1 != 0){
            int cifrasN1 = n1 % 10;
            int cifrasN2 = n2 % 10;
            sumarCifras = cifrasN1 + cifrasN2;
            
            if (sumarCifras >= 8){
                sumarCifras -= 8;
                resultado = resultado + ((int) Math.pow(10,contador) * sumarCifras);
            }
            else {
                resultado += ((int) Math.pow(10,contador) * sumarCifras);
            }
            
            n1 /= 10;
            n2 /= 10;
            contador++;
        }
        return resultado;
    }
}