public class Operadores {
    public static void main(String[] args) {
        /*Para ficar negativo e depois postivo 
         * 
         * int numero = 6;

        numero = - numero;
        //System.out.println(- numero);

        System.out.println(numero);

        numero =  numero * -1;//para virar postivo 

        System.out.println(numero);
         */


         /*Incrementar 
          * //Aumentar o numero 
         int numero = 4;

         //numero = numero + 1;
         numero++; //mesma representação que numero = numero + 2;
         System.out.println(numero);
         */
        
         /**
          *  descrementar 

          int numero = 4;

          
          numero--; //mesma representação que numero = numero + 2;
          System.out.println(numero);
          */
          

          /*
           * Boleano
           * 
           * boolean variavel = true;//verdadeira
          System.out.println(variavel);

          variavel = !variavel;//falsa
          System.out.println(variavel);
           */

           /*
            * Operador ternária ? : 
            verdadeira será ? , caso for falsa será : 

            primeiro ex:

             int a, b;

          a = 5;
          b = 6;
          String resultado = "";
          if(a==b)
            resultado = "verdadeiro";
          else
            resultado = "falso";
         System.out.println(resultado);  
         
            int a, b;

            a = 6;
            b = 6;
            String resultado = a==b ?"verdadeiro"  : "false";
            
           System.out.println(resultado);  


            */
            


            /*
             * Relacionais
             * 
             * == igual a 
             * != diferença
             * > maior
             * < menor
             * >= maior igual
             * <= menor igual
             * 
             * //Quando é obj ou string 
            String nomeUm = "Christiane";
            String nomeDois = "Gozza";

            //System.out.println(nomeUm == nomeDois);

            System.out.println(nomeUm.equals(nomeDois));//o correto é usar esse para obj

            //Usando numeros 
             int numero1 = 1;
             int numero2 = 2;

             boolean simNao = numero1 == numero2;

             if(numero1 < numero2){
                System.out.println("a nossa condição é verdadeira");
             }

             System.out.println("numeroUm é igual a numeroDois: " + simNao);
        
             simNao = numero1 != numero2;

             System.out.println("numeroUm é diferente a numeroDois: " + simNao);

             simNao = numero1 > numero2;

             System.out.println("numeroUm é maior a numeroDois: " + simNao);

             simNao = numero1 < numero2;

             System.out.println("numeroUm é menor a numeroDois: " + simNao);
             */
            


             /*
              * Operadores logicos

              && Operador logico and 
              || Operador logivo or 
              */


              boolean condicao1 = true;
              boolean condicao2 = false;

              if(condicao1 && (7 > 4) /*condicao2*/){
                System.out.println("As duas são verdadeiras");
              }
              if(condicao1 || condicao2){
                System.out.println("Uma das duas condiçoes são verdadeiras");
              } 
              System.out.println("FIM");

            
    }   
}
