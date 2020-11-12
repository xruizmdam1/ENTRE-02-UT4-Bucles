
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
        int cifrasN1 = 0;
        int cifrasN2 = 0;
        int sumaCifras = 0;
        int inverso = 0;
        int resultado = 0;
        while(n1 != 0 && n2 != 0){
            cifrasN1 = n1 % 10;
            cifrasN2 = n2 % 10;
            sumaCifras += cifrasN1 + cifrasN2;
            inverso = inverso * 10 + (sumaCifras % 10);
            cifrasN1 = 0;
            cifrasN2 = 0;
            sumaCifras = 0;
            n1 /= 10;
            n2 /= 10;
        }
        while (sumaCifras == 0 && inverso != 0){
            resultado = resultado * 10 + (inverso % 10);
            inverso /= 10;
        }
        return resultado;
    }
}