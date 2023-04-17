import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> nuberList = new HashMap<>();
    public int add(String name, String nub) {
        if (nuberList.containsKey(nub)){
            throw new RuntimeException("Такой номер уже существует");
        }
        nuberList.put(nub, name);
        return 1;
    }
    public String findByNumber (String number){
        if (nuberList.containsKey(number)){
            return nuberList.get(number);
        }
        return null;
    }
}
