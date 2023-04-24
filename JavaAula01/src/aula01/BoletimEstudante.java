package aula01;
import javax.lang.model.util.ElementScanner6;

/**
 * Identação do codigo para que ele fique mais organizado 
 */

public class BoletimEstudante {
    public static void main(String[] args)  {
        int mediaFinal = 5;
        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if(mediaFinal == 6)
            System.out.println("Prova Minerva");
        else 
            System.out.println("Aprovado");
    }
}
