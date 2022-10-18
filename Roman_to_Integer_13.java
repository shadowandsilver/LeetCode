import java.util.HashMap;

public class Roman_to_Integer_13 {
    public static int romanToInt(String s) {
//
        int count = 0;
//
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

//
        int reciver = 0;

        for(int i = 0; i < s.length();i++){
            if(i == 0){
                for(Character x : map.keySet()){
                    if(s.charAt(i) == x){
                        count = count + map.get(x);
                        reciver = map.get(x);
                    }
                }
            }else{
                for(Character x : map.keySet()){
                    if(s.charAt(i) == x){
                        if(reciver < map.get(x)){
                            count = count + map.get(x) - 2 * reciver;
                            reciver = map.get(x);
                        }else{
                            count = count + map.get(x);
                            reciver = map.get(x);
                        }

                    }
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
       int y =  romanToInt("LVIII");
        System.out.println(y);
    }
}
