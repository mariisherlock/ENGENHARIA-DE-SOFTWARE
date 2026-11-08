public class Main {
    public static void main(String[]args){
        CalculadoraFrete calculadora = new CalculadoraFrete();
        System.out.println(calculadora.calcularFrete(TipoEntrega.NORMAL,100));
        System.out.println(calculadora.calcularFrete(TipoEntrega.EXPRESSO,100));
        System.out.println(calculadora.calcularFrete(TipoEntrega.RETIRADA,100));
        System.out.println(calculadora.calcularFrete(TipoEntrega.NORMAL,250));

    }
}