
package readwriteapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jenna
 */
public class CustomGarageFormat implements TextFormatStrategy {
    
    @Override
    public final String encode(List<Map<String, String>> data) {
        
        Map<String,String> sourceData = data.get(0);
        String sTotalHours = sourceData.get("totalHours");
        String sTotalFees = sourceData.get("totalFees");
        return sTotalHours + "\n" + sTotalFees + "\n";
    }
    
    @Override
    public final List<Map<String,String>> decode(List<String> dataFromFile) {
        String sTotalHours = dataFromFile.get(0);//extract data from file
        String sTotalFees = dataFromFile.get(1);
        
        List<Map<String,String>> appData = new ArrayList<>(); //transform into list of maps
        Map<String,String> record = new HashMap<>();
        record.put("totalHours", sTotalHours);
        record.put("totalFees", sTotalFees);
        appData.add(record);
        return appData;
    }
    
    public static void main(String[] args) {
        CustomGarageFormat format = new CustomGarageFormat();
//        List<Map<String,String>> data = new ArrayList<>();
//        Map<String,String> record = new HashMap<>();
//        record.put("totalHours", "20.50");
//        record.put("totalFees", "33.75");
//        data.add(record);
//        
//        String formattedData = format.encode(data);
//        System.out.println(formattedData);
        List<String> dataFromFile = Arrays.asList("20.50","33.75");
        List<Map<String,String>> appData = format.decode(dataFromFile);
        System.out.println(appData);

    }
}
