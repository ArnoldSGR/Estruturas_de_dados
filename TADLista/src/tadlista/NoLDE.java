package tadlista;

public class NoLDE {

    private NoLDE head;
    private NoLDE tail;
    private Object info;

    public NoLDE() {
        this.head = null;
        this.tail = null;
    }

    public NoLDE(Object o) {
        this.info = o;
        this.head = null;
        this.tail = null;
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
