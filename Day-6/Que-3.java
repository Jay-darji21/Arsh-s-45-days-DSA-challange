import java.util.HashMap;
import java.util.Map;

class Solution{
    public void print(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            map.put(c,1);
        }

        for(Map.Entry<Character,Integer> c : map.entrySet()){
            if(c.getValue()>1){
                System.out.println(c.getKey());
            }
        }
    }
}