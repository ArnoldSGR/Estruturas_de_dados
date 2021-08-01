package pilhavector;

import java.util.Vector;


public class Pilha implements IPilhaVector {
    private Vector<Object> vetor;
    
            
    public Pilha(){
        this.vetor = new Vector<Object>();
    }
    
    public Object top() throws PilhaVaziaException {
        try{
            return this.vetor.lastElement();
        }catch(Exception e ){
            throw new PilhaVaziaException("Pilha Vazia");
        }
    }
    
    public void push(Object o){
        this.vetor.add(o);
        printVector();
    }

   
    public Object pop() throws PilhaVaziaException {
      try{
          Object o = new Object();
          o = top().toString();
          this.vetor.remove(top());
          printVector();
          return o;
          
      }catch(Exception e){
       throw new PilhaVaziaException("Pilha Vazia");   
      }
    }


    public int size() {
        return this.vetor.size();
    }
    
    public void printVector() {
        System.out.print("{");
        for (Object obj : vetor) {
            System.out.print(" ");
            System.out.print(obj);
            System.out.print(" ");
        }
        System.out.println("}");
    }
            
}
