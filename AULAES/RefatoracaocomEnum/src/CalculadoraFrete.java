public class CalculadoraFrete {
    public double calcularFrete(TipoEntrega tipoEntrega,double valorCompra){
        double frete = tipoEntrega.calcular();
        if (valorCompra >= 200) {
            frete = frete * 0.5;
        }
      return frete;
    }

}
