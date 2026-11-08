public class CalculadoraFrete {
    public double calcularFrete(String tipoEntrega, double valorCompra) {
        double frete = 0;
        switch (tipoEntrega) {
            case "NORMAL":
                frete = 15.00;
                break;
            case "EXPRESSO":
                frete = 30.00;
                break;
            case "RETIRADA":
                frete = 0.00;
                break;

            default:
                System.out.println("Tipo de entrega inválido.");
                return -1;
        }

        if (valorCompra >= 200) {
            frete = frete * 0.5;
        }

        return frete;
    }
}
