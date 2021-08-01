
package arvorebb;

public class ArvoreBP {

    
    public static void main(String[] args) {
        NoBP arvore = new NoBP(10);
        NoBP.mount(arvore,null);
        
        NoBP num5 = new NoBP(5);
        NoBP.mount(num5, arvore);
        
        NoBP num20 = new NoBP(20);
        NoBP.mount(num20, arvore);
        
        NoBP num33 = new NoBP(33);
        NoBP.mount(num33, arvore);
        
        NoBP num1 = new NoBP(1);
        NoBP.mount(num1, arvore);
        
        NoBP num2 = new NoBP(2);
        NoBP.mount(num2, arvore);
        
        NoBP num7 = new NoBP(7);
        NoBP.mount(num7, arvore);
        
        NoBP num30 = new NoBP(30);
        NoBP.mount(num30, arvore);
        
        System.out.println("Pos-ordem:");
        NoBP.imprimirPosOrdem(arvore);
        System.out.println("");
        
        System.out.println("Pre-ordem:");
        NoBP.imprimirPreOrdem(arvore);
        System.out.println("");
        
        System.out.println("Em-ordem:");
        NoBP.imprimirEmOrdem(arvore);
        System.out.println("");
    }
    
}
