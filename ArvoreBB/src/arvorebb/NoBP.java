package arvorebb;

public class NoBP {
    private int value;
    private NoBP esquerdo;
    private NoBP direito;
    
    NoBP(int value){
        this.value = value;
        this.esquerdo = null;
        this.direito = null;
    }
    
    public static void mount(NoBP novo, NoBP arvore){
        if(arvore == null){
            arvore = novo;
        } else {
            if(novo.value <  arvore.value){
                if(arvore.esquerdo == null){
                    arvore.esquerdo = novo;
                } else {
                    mount(novo, arvore.esquerdo);
                }
            }else{
                if(arvore.direito == null){
                    arvore.direito = novo;
                }else{
                    mount(novo, arvore.direito);
                }
            }
        }
    }
    
    public static boolean buscaNo (NoBP arvore, int valor){
        boolean retorn = false;
        
        if(arvore == null){
            retorn = false;
        }else if (arvore.value == valor){
            retorn = true;
        }else{
            if(arvore.value > valor){
                retorn = buscaNo(arvore.esquerdo, valor);
            }else{
                retorn = buscaNo(arvore.direito, valor);
            }
        }
        return retorn;
    }
    
    public static void imprimirPreOrdem(NoBP n ){
        System.out.print(n.value + " ");
        
        if(n.esquerdo != null){
            imprimirPreOrdem(n.esquerdo);
        }
        
        if(n.direito != null){
            imprimirPreOrdem(n.direito);
        }
    }
    
    public static void imprimirPosOrdem(NoBP n ){
            if(n.esquerdo != null){
                imprimirPosOrdem(n.esquerdo);
            }
            
            if(n.direito != null){
            imprimirPosOrdem(n.direito);
            }
            
            System.out.print(n.value + " ");
         }
    
    public static void imprimirEmOrdem(NoBP n ){
        if(n.esquerdo != null){
            imprimirEmOrdem(n.esquerdo);
        }
        
        System.out.print(n.value + " ");
        
        if(n.direito != null){
            imprimirEmOrdem(n.direito);
        }
    }
}
