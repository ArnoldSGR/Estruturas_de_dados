
package pilhaarray;

public interface IPilhaInterface {

	Object top() throws PilhaVaziaException;

	void push(Object o);

	Object pop() throws PilhaVaziaException;

	int size();

}