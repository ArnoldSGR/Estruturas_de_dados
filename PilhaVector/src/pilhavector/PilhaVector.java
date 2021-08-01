//Classe para testes

package pilhavector;


public class PilhaVector {

    
    public static void main(String[] args) throws PilhaVaziaException {
        Pilha p1 = new Pilha();
        
        p1.push("Arnold");
        p1.push("TADS");
        p1.push("Java");
        p1.push("Alpha");
        p1.push(2);
        p1.push(4);
        p1.push(6);
        p1.push(8);
        p1.printVector();
        System.out.println(p1.pop());
        System.out.println(p1.size());
        System.out.println(p1.pop());
        System.out.println(p1.size());
        System.out.println(p1.pop());
        System.out.println(p1.size());
        System.out.println(p1.pop());
        System.out.println(p1.size());
        System.out.println(p1.pop());
        System.out.println(p1.size());
        System.out.println(p1.pop());
        System.out.println(p1.size());
        System.out.println(p1.pop());
        System.out.println(p1.size());
        System.out.println(p1.pop());
        System.out.println(p1.size());
        System.out.println(p1.pop());
        
    }
    
}
