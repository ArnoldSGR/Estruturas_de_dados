
package vetor;

public class Vetor {

   
    public static void main(String[] args) throws VectorException {
        Vector v = new Vector();
        
            v.insertAtRank(0, "v");
            v.insertAtRank(1, "e");
            v.insertAtRank(2, "t");
            v.insertAtRank(3, "o");
            v.insertAtRank(4, "r");
            v.insertAtRank(5, "e");
            v.insertAtRank(6, "s");
            v.insertAtRank(15, "teste");
            v.print();
            System.out.println(v.removeAtRank(0));
            v.print();
            System.out.println(v.size());
    }
    
}
