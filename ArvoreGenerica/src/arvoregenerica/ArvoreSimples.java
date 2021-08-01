
package arvoregenerica;

/**
 *
 * @author Arnold
 */
import java.util.Iterator;

public class ArvoreSimples {
	
    No raiz;
    int tamanho;
    public ArvoreSimples(Object o) {
	raiz = new No(null, o);
	tamanho = 1;
    }
    
    public No root() {
	return raiz;
    }
    
    public No parent(No v) {
	return (v.parent());
    }

    public Iterator children(No v) {
	return v.children();
    }

    public boolean isInternal(No v) {
	return (v.childrenNumber() > 0);
    }
	
    public boolean isExternal(No v) {
	return (v.childrenNumber() == 0);
    }

    public boolean isRoot(No v) {
	return v == raiz;
    }

    public void addChild(No v, Object o) {
	No novo = new No(v, o);
	v.addChild(novo);
	tamanho++;
    }

    public Object remove(No v) throws InvalidNoException {
	No pai = v.parent();
	if (pai != null || isExternal(v)) pai.removeChild(v);
        else throw new InvalidNoException();
	Object o = v.element();
	tamanho--;
	return o;
    }
	
    public void swapElements(No v, No w) {
        No paiDoV = v.parent();
        No paiDoW = w.parent();
        v.setPai(paiDoW);
        w.setPai(paiDoV);
    }
	
    public int depth(No v) {
	int profundidade = profundidade(v);
	return profundidade;
    }
        
    private int profundidade(No v) {
        if (v == raiz) return 0;
        else return 1 + profundidade(v.parent());
    }
	
    public int height() {
	// Método que serve de exercício
	int altura = 0;
	return altura;
    }
	
    public Iterator elements() {
	return this.raiz.children();
    }
	
    public Iterator Nos() {
	// Método que serve de exercício
	return null;
    }
	
    public int size() {
	// Método que serve de exercício
	return 0;
    }
	
    public boolean isEmpty() {
	return false;
    }
	
    public Object replace(No v, Object o) {
        v.setElement(o);
        return o;
    }
}
