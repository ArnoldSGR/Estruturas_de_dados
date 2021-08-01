
package dequevector;

import java.util.Vector;


public class Deque implements IDequeVector {
    
    Vector<Object> vetor;
    
    public Deque(){
        vetor = new Vector<Object>();
    }
            
    @Override
    public void inserirInicio(Object o) {
        vetor.add(0, o);
    }

    @Override
    public void inserirFim(Object o) {
        vetor.add(o);
    }

    @Override
    public Object removerInicio() throws DequeVazioException {
        try{
            if(isEmpty()){
                throw new DequeVazioException("Deque Vazio!");
            }
            
            Object o = vetor.firstElement();
            vetor.remove(0);
            return o;
            
        }catch (DequeVazioException e){
            System.out.println(e.getMessage());
            return null;
        }
        
    }

    @Override
    public Object removerFim() throws DequeVazioException {
        try{
            if(isEmpty()){
                throw new DequeVazioException("Deque Vazio!");
            }
            
            Object o = vetor.lastElement();
            vetor.remove(size() - 1);
            return o;
            
        }catch (DequeVazioException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Object first() throws DequeVazioException {
       try{
           if(isEmpty()){
               throw new DequeVazioException("Deque Vazio!");
           }
           
           return vetor.firstElement();
           
       }catch(DequeVazioException e){
           System.out.println(e.getMessage());
           return null;
       }
    }

    @Override
    public Object last() throws DequeVazioException {
        try{
            if(isEmpty()){
                throw new DequeVazioException("Deque Vazio!");
            }
            
            return vetor.lastElement();
            
        }catch(DequeVazioException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public int size() {
        return vetor.size();
    }

    @Override
    public boolean isEmpty() {
       return vetor.isEmpty();
    }

    @Override
    public void mostrar() {
        for(Object o : vetor){
            System.out.println(o);
        }
    }
}
