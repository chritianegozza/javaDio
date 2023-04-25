public class SmartTv {
    boolean ligada=false;
    int canal=2;
    int volume =22;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }


    public void diminuirCanal() {
        canal--;
    }


    //método para aumentar o volume da tv 
    public  void aumentarVolume() {
        System.out.println("Aumentando o volume para: " + volume );
        //volume = volume + 1;
        volume++;
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
        
    }


    public void ligar() {
        ligada=true;  
    }
    public void desligar() {
        ligada=false;
    }

}
