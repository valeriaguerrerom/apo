//CALCULO FACTORIAL
import favax.swing. J0ptionPane;
public class taller15sep {
    public static void sain (Stringl[] args) {
        //T000 Auto-generated method stub
    int opcion = 0;
    while (opcion!=2) {
    opcion=Integer parseInt (JOptionPane. showInputDialog(null, "1. Calcular Factorial/n"
            +"2.exitin", "menu de operaciones", -1));
    switch (opcion) {

    case 1:
    int num1 = Integer parseInt (JOptionPane. showInputDialog(null, "ingrese un numero entero POSITIVO", "Factorial",-1)):
    if (numb=>1) {
    int results = calcularFactorial（numl)；
    JOptionPane, showMessageDialog(null, "El factorial del numero es igual a: "+ result, "factorial",2);
    else
    30pt zonPane. sho
    30ptionPane, sho break;
    geDialog (null,"El numero ingresado no es un entero positivo", "ERROR", 0);
    Dialog(null," ¿deseas calcular el factorial de otro numero?", "¿volvemos al menu?",-1);
    case 2:
    30ptionPane. showMessageDialog(null,"Saliste del nenu, vuelve pronto", "adios",-1);
    break:
    3184
    public static int calcularfactorial(int a) {
    Long result = 1
    for (int 1 = 1）
    result
    return (int) result;