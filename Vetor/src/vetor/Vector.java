package vetor;

public class Vector implements IVector {
    private int size;
    private int capacity = 10;
    private Object[] vetor = new Object[this.capacity];

    public void insertAtRank(int pos, Object el) throws VectorException {
        if (pos < 0) {
            throw new VectorException("Índice excede as extremidade do Array.");
        } else if (pos > this.capacity) {
            this.dobraVetor();
            vetor[pos] = el;
            size *= 2;
            
        } else if(pos != capacity - 1 && vetor[capacity - 1 ] == null) {
            moveDir(pos);
            vetor[pos] = el;
            size++;
        }else{
            this.dobraVetor();
            moveDir(pos);
            vetor[pos] = el;
            size ++;
        }
    }

    public void moveEsq(int pos) {
        System.arraycopy(this.vetor, pos + 1, this.vetor, pos, (this.vetor.length - 1) - (pos + 1));
    }

    public void moveDir(int pos) {
        System.arraycopy(this.vetor, pos, this.vetor, pos + 1, (this.vetor.length - 1) - (pos + 1));
    }

    public Object removeAtRank(int pos) throws VectorException {
        if (pos >= this.capacity || pos < 0) {
            throw new VectorException("Índice excede o tamanho do array.");
        }

        Object removido = elemAtRank(pos);
        if (vetor[pos] == null) {
            return null;
        } else if (pos == this.capacity - 1) {
            vetor[pos] = null;
            return null;
        } else if (vetor[pos] != null) {
            vetor[pos] = null;
            moveEsq(pos);
            size -= 1;
        }
        return removido;
    }

    public Object elemAtRank(int pos) throws VectorException {
        if (pos >= this.capacity || pos < 0) {
            throw new VectorException("Índice excede o tamanho do array.");
        }
        return this.vetor[pos];
    }

    public Object replaceAtRank(int pos, Object el) throws VectorException {
        Object removido = elemAtRank(pos);
        this.vetor[pos] = el;
        return removido;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private void dobraVetor() {
        Object[] novo = new Object[this.capacity * 2];
        System.arraycopy(this.vetor, 0, novo, 0, this.vetor.length - 1);
        this.vetor = novo;
        this.capacity *= 2;
    }

    public void print() {
        for (int i = 0; i < this.capacity; i++) {
            if (vetor[i] == null) {
                System.out.print("-");
                continue;
            }
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
