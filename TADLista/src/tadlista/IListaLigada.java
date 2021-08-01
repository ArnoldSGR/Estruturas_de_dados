package tadlista;

public interface IListaLigada {
    int size();
    boolean isEmpty();
    NoLDE first();
    NoLDE last();
    NoLDE before(NoLDE p);
    NoLDE after(NoLDE p);
    Object replaceElement(NoLDE n, Object o);
    NoLDE insertBefore(NoLDE n, Object o);
    NoLDE insertAfter(NoLDE n, Object o);
    NoLDE insertFirst(Object o);
    NoLDE insertLast(Object o);
    Object remove(NoLDE n);
}
