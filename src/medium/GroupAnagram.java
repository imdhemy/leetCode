package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<Integer, List<String>> map = new HashMap<>();

        int numericValue;

        for (String str : strs) {
            numericValue = 0;
            for (int i = 0; i < str.length(); i++) {
                numericValue ^= Character.getNumericValue(str.charAt(i));
            }

            if (map.containsKey(numericValue))
                map.get(numericValue).add(str);
            else {
                List<String> tmp = new ArrayList<>();
                tmp.add(str);
                map.put(numericValue, tmp);
            }
        }

        for (int key : map.keySet())
            result.add(map.get(key));

        return result;
    }
}
