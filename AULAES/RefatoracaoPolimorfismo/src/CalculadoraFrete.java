public class CalculadoraFrete {

    public double calcularFrete(String tipoEntrega, double valorCompra) {
        TipoEntrega entrega = null;
        switch (tipoEntrega.toUpperCase()) {
            case "NORMAL":
                entrega = new EntregaNormal();
                break;
            case "EXPRESSO":
                entrega = new EntregaExpressa();
                break;
            case "RETIRADA":
                entrega = new EntregaRetirada();
                break;
            default:
                System.out.println("Tipo de entrega inválido.");
                return -1;
        }
        double frete = entrega.calcularFrete();
        if (valorCompra >= 200) {
            frete = frete * 0.5;
        }
        return frete;
    }
}
