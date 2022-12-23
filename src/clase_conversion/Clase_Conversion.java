
/**
 * Manuel Flores
 */

package clase_conversion;

public class Clase_Conversion {
    
    public static void main(String[] Args){
        
        int opcionMenuPrincipal = 0;
        Conversion euro = new Conversion(1, 1, 1);
        Conversion dolar = new Conversion(1, 1, 1);
        
        String menuPrincipal =
                "-----------------------------\n" +
                "Elije la opción que desees:\n" +
                "1. Cambiar euros a dólares\n" +
                "2. Cambiar dólares a euros\n" +
                "3. Salir del conversor\n" +
                "-----------------------------";    
        do{
            opcionMenuPrincipal = ES.leeEntero(menuPrincipal, 1, 3);
            switch (opcionMenuPrincipal){
                case 1:
                    cambioEuros(euro);
                    break;
                case 2:
                    cambioDolar(dolar);
                    break;
                case 3:
                    ES.msgln("Fin del programa");
                    break;
            }
        }while (opcionMenuPrincipal != 3);

    }
    
    static void cambioEuros (Conversion conversion){
        double valor = ES.leeDecimal("Cantidad de euros a cambiar: ", 0);
        double ratio = ES.leeDecimal("Ratio de cambio: ", 0);
        conversion.hacerCambio(valor, ratio);
        ES.msgln(conversion.getValor() + " euros son " + conversion.getCambio() + " dólares.");
    }
    static void cambioDolar (Conversion dolar){
        double valor = ES.leeDecimal("Cantidad de dólares a cambiar: ", 0);
        double ratio = ES.leeDecimal("Ratio de cambio: ", 0);
        dolar.hacerCambio(valor, ratio);
        ES.msgln(dolar.getValor() + " dólares son " + dolar.getCambio() + " euros.");
    }
}

    