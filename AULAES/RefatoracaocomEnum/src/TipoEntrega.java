public enum TipoEntrega {
    NORMAL{
        public double calcular(){
            return 15.00;
        }
    },
    EXPRESSO{
        public double calcular(){
            return 30.00;
        }
    },
    RETIRADA{
        public double calcular(){
            return 0.00;
        }
    };
    public abstract double calcular();


}

