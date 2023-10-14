public class AreaCirculo {
    //Esta línea declara una clase pública llamada 
    public static void main(String[] args) {
        //Esta línea declara el método main(), que es el método de entrada de todas las aplicaciones Java. El método main() es el primer método que se ejecuta cuando se inicia una aplicación Java.
        double radio = 5.0;
        //Esta línea declara una variable de tipo.double llamada radio y le asigna el valor 5.0.
        double area = Math.PI * Math.pow(radio, 2);
        //Esta linea calcula el area del circulo utilizando la formula área = π * radio^2
        //La variable Math.PI representa el valor de pi, que es una constante matemática aproximadamente igual a 3.14.
        // Este código calcula el área de un círculo dado el radio. El código primero declara una variable para almacenar el radio del círculo
        System.out.println ("El área del círculo es: " + area);
    }
}
