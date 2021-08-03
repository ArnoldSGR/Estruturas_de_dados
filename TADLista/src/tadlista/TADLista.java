
package tadlista;

public class TADLista {

    public static void main(String[] args) throws LDEException {
        ListaDE lista = new ListaDE();
        lista.insertFirst("primeira");
        lista.insertLast("segunda");
        lista.insertLast("terceira");
        lista.insertLast("quarta");
        lista.print();
    }
    
}
