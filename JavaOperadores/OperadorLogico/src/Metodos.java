public class Metodos {
    //métodos correspondem a funçoes ou sub-
    //Usar camelCase, deve ser usado verbo

    public double somar(int num1, int num2){
        //Logica - finalidade do método
        return ...;
    }

    public void imprimir(String texto){
        //logica - finalidade do metodo
        //Aqui não precisa do return
        //pois não será retpornando nenhum resultado
    }

    //throws Exception : indica que o método ao ser utiçlizado 
    //poderá gerar uma exceção

    public double dividir(int dividendo, int divisor) throws Exception{

    }


    //este método não pode ser visto por poutras classes no programa
    private void metodoPrivado() {
        
    }

    //alguns equivocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)
    }

    public void calcularEnviar() {
        //um método deve representar uma unica responsabilidade
    }

    public void gravarCliente(String nome, String cpf, Integer dataNascimento) {
        //este metodo tem a finalidade de gravar
        //informações de um cliente, porque nãp criar
        //um objeto cliente  e passar como parametro
        //veja abaixo
    }

    public void gravarCliente(Cliente cliente){}
    // ou usar esse
    public void gravar(Cliente cliente){}
    
}
