import java.util.*;

public class PhoneBook {
    Map<String, String> nuberList = new HashMap<>();

    public int add(String name, String nub) {
        if (nuberList.containsKey(nub)) {
            throw new RuntimeException("Такой номер уже существует");
        }
        nuberList.put(nub, name);
        return 1;
    }

    public String findByNumber(String number) {
        if (nuberList.containsKey(number)) {
            return nuberList.get(number);
        }
        return null;
    }

    public String findByName(String name) {
        return nuberList.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), name))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public String printAllNames() {
        return nuberList.values().toString();
    }
}

