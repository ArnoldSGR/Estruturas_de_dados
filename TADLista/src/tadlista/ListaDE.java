package tadlista;

public class ListaDE {

    // sentinelas
    private NoLDE inicio = new NoLDE();
    private NoLDE fim = new NoLDE();

    public NoLDE first() throws LDEException {
        if (this.isEmpty()) {
            throw new LDEException("A lista está vazia.");
        } else {
            return this.inicio.getProximo();
        }
    }

    public NoLDE last() throws LDEException {
        if (this.isEmpty()) {
            throw new LDEException("A lista está vazia.");
        } else {
            return this.fim.getAnterior();
        }
    }

    public NoLDE before(Object o) throws LDEException {
        if (this.isEmpty()) {
            throw new LDEException("A lista está vazia.");
        }
        NoLDE noAtual = this.inicio.getProximo();
        while (true) {
            if (noAtual.getInfo() == o) {
                if (noAtual.getAnterior() == null) {
                    throw new LDEException("Nó inicial, não há antecessor.");
                }
                return noAtual.getAnterior();
            }
            noAtual = noAtual.getProximo();
        }
    }

    public NoLDE after(Object o) throws LDEException {
        if (this.isEmpty()) {
            throw new LDEException("A lista está vazia.");
        }
        NoLDE noAtual = this.inicio.getProximo();
        while (true) {
            if (noAtual.getInfo() == o) {
                if (noAtual.getProximo() == null) {
                    throw new LDEException("Nó final, não há sucessor.");
                }
                return noAtual.getProximo();
            }
            noAtual = noAtual.getProximo();
        }
    }

    public Object replaceElement(Object o, Object novoValor) throws LDEException {
        if (this.isEmpty()) {
            throw new LDEException("A lista está vazia.");
        }
        NoLDE noAtual = this.inicio.getProximo();
        while (true) {
            if (noAtual.getInfo() == o) {
                noAtual.setInfo(novoValor);
                return novoValor;
            }
            if (noAtual == this.fim) {
                throw new LDEException("Nó inexistente.");
            }
            noAtual = noAtual.getProximo();
        }
    }

    public NoLDE insertBefore(Object node, Object valor) throws LDEException {
        if (this.isEmpty()) {
            throw new LDEException("A lista está vazia.");
        }
        NoLDE noAtual = this.inicio.getProximo();
        while (true) {
            if (noAtual == this.fim) {
                throw new LDEException("Nó inexistente.");
            }
            if (noAtual.getInfo() == node) {
                if (noAtual.getAnterior().getInfo() == null) {
                    this.insertFirst(valor);
                    return noAtual;
                }

                NoLDE novo = new NoLDE(valor);

                NoLDE anterior = noAtual.getAnterior();
                NoLDE proximo = noAtual;

                anterior.setProximo(novo);
                proximo.setAnterior(novo);

                novo.setAnterior(anterior);
                novo.setProximo(proximo);

                return novo;

            }
            noAtual = noAtual.getProximo();
        }
    }

    public NoLDE insertAfter(Object node, Object valor) throws LDEException {
        if (this.isEmpty()) {
            throw new LDEException("A lista está vazia.");
        }
        NoLDE noAtual = this.inicio.getProximo();
        while (true) {
            if (noAtual == this.fim) {
                throw new LDEException("Não existe nó sucessor.");
            }
            if (noAtual.getInfo() == node) {
                if (noAtual.getProximo().getInfo() == null) {
                    this.insertLast(valor);
                    return noAtual;
                }

                NoLDE novo = new NoLDE(valor);

                NoLDE anterior = noAtual;
                NoLDE proximo = noAtual.getProximo();

                anterior.setProximo(novo);
                proximo.setAnterior(novo);

                novo.setAnterior(anterior);
                novo.setProximo(proximo);

                return novo;

            }
            noAtual = noAtual.getProximo();
        }
    }

    public boolean isEmpty() {
        if (this.inicio.getProximo() == null && this.fim.getAnterior() == null) {
            return true;
        }
        return false;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        NoLDE noAtual = this.inicio;
        int count = -1;
        while (true) {
            if (noAtual == this.fim) {
                return count;
            }
            noAtual = noAtual.getProximo();
            count++;
        }
    }

    public void insertLast(Object o) {
        NoLDE novo = new NoLDE(o);
        if (this.inicio.getProximo() == null) {
            this.inicio.setProximo(novo);
            this.fim.setAnterior(novo);

            novo.setAnterior(this.inicio);
            novo.setProximo(this.fim);
        } else {
            NoLDE ultimo = this.fim.getAnterior();

            this.fim.setAnterior(novo);
            ultimo.setProximo(novo);

            novo.setAnterior(ultimo);
            novo.setProximo(this.fim);
        }
    }

    public void insertFirst(Object o) {
        if (this.isEmpty()) {
            this.insertLast(o);
        } else {
            NoLDE novo = new NoLDE(o);

            NoLDE primeiro = this.inicio.getProximo();

            primeiro.setAnterior(novo);

            this.inicio.setProximo(novo);

            novo.setAnterior(this.inicio);
            novo.setProximo(primeiro);
        }

    }

    public NoLDE remove(Object o) throws LDEException {
        NoLDE noAtual = this.inicio;
        while (true) {
            if (noAtual == this.fim) {
                throw new LDEException("Nó inexistente.");
            }
            if (noAtual.getInfo() == o) {
                NoLDE anterior = noAtual.getAnterior();
                NoLDE proximo = noAtual.getProximo();
                anterior.setProximo(proximo);
                proximo.setAnterior(anterior);
                return noAtual;
            }
            noAtual = noAtual.getProximo();
        }
    }

    public void print() throws LDEException {
        if (this.isEmpty()) {
            throw new LDEException("Lista vazia.");
        }
        NoLDE noAtual = this.inicio.getProximo();
        while (true) {
            if (noAtual == this.fim) {
                System.out.println();
                return;
            }
            System.out.print(noAtual.getInfo() + " ");
            noAtual = noAtual.getProximo();
        }
    }
}
