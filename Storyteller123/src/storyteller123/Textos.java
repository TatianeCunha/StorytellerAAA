package storyteller123;


public class Textos {

    
    static int i;
    
    public Textos(){
        i = 1;
    }
    
    public String getTextos(){
        switch (i){
            case 1:
                i++;
                return  "                                                                                                     WAKE UP\n\n"
                        + "\nThis.name abre os olhos lentamente, percebe que tudo ao seu redor está embaçado e escuro, enquanto sente dores "
                        + "\nnas costas latejantes.  Quanto mais se mexe, mais um líquido estranho vai se espalhando por suas costas. This.na"
                        + "\n-me coloca as mãos no chão, tocando em um tapete molhado, não se recordando como chegou ali e onde estava. Su"
                        + "\n-a visão melhora, porém ela(e) consegue visualizar apenas uma luminária ligada bem fraca no canto do quarto, ilumin"
                        + "\n-ando parte de uma parede com um quadro no seu centro. Ela(e) tenta se levantar, mas as dores nas costas aumen"
                        + "\n-tam, e ao se apoiar em algo que estava no chão, this.name se recorda de sua última memória do que poderia ter ocor"
                        + "\n-rido nesta manhã, enquanto sente algo estrado no objeto em que está se apoiando.\n\n\n";
            case 2:
                i++;
                return "[0][2]";
             case 3:
                i++;
                return "[0][3]";
             case 4:
                i++;
            return "[0][4]";
            case 5:
                i++;
                return "[0][5]";
            case 6:
                i++;
                return "[0][6]";
             case 7:
                i++;
                return "[0][7]";
             case 8:
                i++;
            return "[0][8]";
        
        }
        
        return null;
        
    }
    
    
    public static String narrar(){
        Documentos joagador = new  Documentos();
        return "Bla bla bla narracao";
    }

        
}
