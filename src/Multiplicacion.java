public class Multiplicacion extends Operacion {


    public Multiplicacion(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return numero1 * numero2;
    }

}
