package storyteller123;


public class Storyteller123 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


         Textos t = new Textos();
         Introducao intro = new Introducao();
       
        System.out.println( intro.setGetNarracao());


		Historia historia = new Historia(5);
               
		Evento e1 = new Evento(t.getTextos(), "Olho o corpo", "Vou embora");
		Evento e2 = new Evento(t.getTextos(), "copo", "piano", "veneno");
		Evento e3 = new Evento(t.getTextos(), "c ta maluco", "oloco meu", "oloquinho meu");
		Evento e4 = new Evento(t.getTextos(), "botao 1", "botao 2", "botao 3");

		
		historia.addHistoria(e1);
		historia.addHistoria(e2);
		historia.addHistoria(e3);
		historia.addHistoria(e4);
                

		
                
		historia.getHistoria();



    }
    
}
