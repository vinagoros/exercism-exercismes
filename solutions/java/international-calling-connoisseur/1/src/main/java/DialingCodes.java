import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    Map<Integer, String> dialingCodesDictionary = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodesDictionary;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodesDictionary.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodesDictionary.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!(dialingCodesDictionary.containsKey(code) || dialingCodesDictionary.containsValue(country))){
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        if (dialingCodesDictionary.containsValue(country)) {
            for (Map.Entry<Integer, String> entry : dialingCodesDictionary.entrySet()) {
                if (entry.getValue().equals(country)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer currentCountryCode = findDialingCode(country);
        if(currentCountryCode!= null){
            dialingCodesDictionary.remove(currentCountryCode);
            dialingCodesDictionary.put(code, country);
        }
    }
}
