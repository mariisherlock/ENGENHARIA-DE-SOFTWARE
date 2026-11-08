public static void main(String[] args) {

    CalculadoraFrete calculadora = new CalculadoraFrete();

    System.out.println("Normal: R$ " +
            calculadora.calcularFrete("NORMAL", 100));

    System.out.println("Expresso: R$ " +
            calculadora.calcularFrete("EXPRESSO", 100));

    System.out.println("Retirada: R$ " +
            calculadora.calcularFrete("RETIRADA", 100));

    System.out.println("Normal com desconto: R$ " +
            calculadora.calcularFrete("NORMAL", 250));
}
