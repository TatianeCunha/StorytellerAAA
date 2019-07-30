package storyteller123;

public class Introducao extends Textos {
       
    private String narracao;

    public String setGetNarracao() {
        
        this.narracao = Textos.narrar();
        return narracao;
    }
 
   
}
