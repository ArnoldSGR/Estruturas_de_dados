package vetor;
public interface IVector {
    public Object elemAtRank(int r) throws VectorException;
    public Object replaceAtRank(int r, Object o) throws VectorException;
    public Object removeAtRank(int r) throws VectorException;
    public void insertAtRank(int r, Object o) throws VectorException;
    public int size();
    public boolean isEmpty();
}