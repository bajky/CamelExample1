package serverimpl;

import org.springframework.stereotype.Service;

/**
 * @author David david.bajko@senacor.com
 */
@Service
public class MultiplierService implements Multiplier {
    public int multiply(int originalNumber) {
        return originalNumber * 3;
    }
}
