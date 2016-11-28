
package readwriteapp;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Jenna
 */
public interface TextFormatStrategy {

    List<Map<String, String>> decode(List<String> dataFromFile) throws Exception;

    String encode(List<Map<String, String>> data);
    
}
