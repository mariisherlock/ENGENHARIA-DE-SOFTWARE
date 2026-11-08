public class Main {
    public static void main(String[] args) {

            CalculadoraFrete calculadora = new CalculadoraFrete();

            System.out.println(calculadora.calcularFrete("NORMAL", 100));
            System.out.println(calculadora.calcularFrete("EXPRESSO", 100));
            System.out.println(calculadora.calcularFrete("RETIRADA", 100));
            System.out.println( calculadora.calcularFrete("NORMAL", 250));
    }
}
