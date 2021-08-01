
package arvoregenerica;

/**
 *
 * @author Arnold
 */
public class InvalidNoException extends Exception {

    /**
     * Creates a new instance of <code>InvalidNoException</code> without detail
     * message.
     */
    public InvalidNoException() {
    }

    /**
     * Constructs an instance of <code>InvalidNoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidNoException(String msg) {
        super(msg);
    }
}
