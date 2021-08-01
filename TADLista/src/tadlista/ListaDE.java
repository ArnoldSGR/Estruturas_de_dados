package tadlista;

public class ListaDE implements IListaLigada {

    private int numElements;
    //sentinelas
    private NoLDE inicio;
    private NoLDE fim;

    public ListaDE() {
        this.numElements = 0;
        this.inicio = new NoLDE(null, null, null);
        this.fim = new NoLDE(inicio, null, null);
        this.inicio.setProximo(fim);
    }

    public void initiate() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public int size() {
        return numElements;
    }

    @Override
    public boolean isEmpty() {
        return (numElements < 1);
    }

    protected NoLDE checkPosition(Position p) throws InvalidPositionException {
        if (p == null) {
            throw new InvalidPositionException("Parâmetro de posição nulo!");
        }

        if (p == inicio) {
            throw new InvalidPositionException("Sentinela de inicio não é uma posição válida!");
        }

        if (p == fim) {
            throw new InvalidPositionException("Sentinela de fim não é uma posição válida!");
        }

        try {
            NoLDE temp = (NoLDE) p;
            if ((temp.getAnterior() == null) || (temp.getProximo() == null)) {
                throw new InvalidPositionException("Posição não pertecente a uma lista ligada.");
            }
            return temp;
        } catch (ClassCastException e) {
            throw new InvalidPositionException("Tipo incompatível para este container.");
        }
    }

    public boolean isFirst(Position p) throws InvalidPositionException {
        NoLDE v = checkPosition(p);
        return v.getAnterior() == inicio;
    }

}
