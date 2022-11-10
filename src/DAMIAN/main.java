package DAMIAN;

public class main {
    private static int opcion;
    private static int cantidad;

    public static void main(String[] args) {
        cajerod.mostrarMenu();
        opcion =cajerod.introducirOpcion();
        if (opcion==1){
            do (){
        cajerod.preguntarCantidad();
        cantidad= cajerod.preguntarCantidad();
        while (!cajerod)
        if (cajerod.esMultiploCinco(cantidad)){
            cajerod.contarBilletes(cantidad);
            cajerod.mostrarBilletes();
        }else {
            cajerod.mostrarError();
        }
        }else {
            exit();
        }
    }

    private static void exit(){

    }
}
