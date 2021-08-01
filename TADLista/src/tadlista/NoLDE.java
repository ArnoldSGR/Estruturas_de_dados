
package tadlista;


public class NoLDE implements Position {
    NoLDE head;
    NoLDE  tail;
    Object info;
   
    public NoLDE(NoLDE head, NoLDE tail, Object info){
        this.head = head;
        this.tail = tail;
        this.info = info;
    }
    
    public Object info() throws InvalidPositionException{
        if((head == null) && (tail == null)){
            throw new InvalidPositionException("Posição Inválida!");
        }
        return info;
    }
    
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NoLDE getAnterior() {
        return head;
    }

    public void setAnterior(NoLDE anterior) {
        this.head = anterior;
    }

    public NoLDE getProximo() {
        return tail;
    }

    public void setProximo(NoLDE proximo) {
        this.tail = proximo;
    }
    
}
