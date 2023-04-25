public class Conta {
    //exempli de escopo
    //variavel da classe conta
    double saldo = 10.0;

    private void sacar(Double valor) {
        //variavel local de método
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo() {
        //disponivel em toda classe
        System.out.println(saldo);
        //somente o metodo sacar conhece essa varivel 
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        //variavel local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; //começando a variavel 
        for(int x=1; x<=5; x++){ //x variavel de escopo
            //esta variavel será reiniciada a cada execução 
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;

        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponiveis fora

        return valorMontante;
    }
}
