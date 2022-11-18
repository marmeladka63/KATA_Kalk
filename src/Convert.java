import java.util.TreeMap;

public class Convert {
    TreeMap<String, Integer> romKeyMap = new TreeMap<>();
    TreeMap<Integer, String> arabKeyMap = new TreeMap<>();

    public Convert() {
        romKeyMap.put("I", 1);
        romKeyMap.put("II", 2);
        romKeyMap.put("III", 3);
        romKeyMap.put("IV", 4);
        romKeyMap.put("V", 5);
        romKeyMap.put("VI", 6);
        romKeyMap.put("VII", 7);
        romKeyMap.put("VIII", 8);
        romKeyMap.put("IX", 9);
        romKeyMap.put("X", 10);

        arabKeyMap.put(100, "C");
        arabKeyMap.put(90, "XC");
        arabKeyMap.put(80, "LXXX");
        arabKeyMap.put(70, "LXX");
        arabKeyMap.put(60, "LX");
        arabKeyMap.put(50, "L");
        arabKeyMap.put(40, "XL");
        arabKeyMap.put(30, "XXX");
        arabKeyMap.put(20, "XX");
        arabKeyMap.put(10, "X");
        arabKeyMap.put(9, "IX");
        arabKeyMap.put(8, "VIII");
        arabKeyMap.put(7, "VII");
        arabKeyMap.put(6, "VI");
        arabKeyMap.put(5, "V");
        arabKeyMap.put(4, "IV");
        arabKeyMap.put(3, "III");
        arabKeyMap.put(2, "II");
        arabKeyMap.put(1, "I");


    }

    public boolean isRoman(String num) {
        return romKeyMap.containsKey(num);
    }

    public int romToArab(String a) {
        return romKeyMap.get(a);
    }


    public String arabToRom(int num) {
        String st = "";
        int arab;
        while (num != 0) {
            arab = arabKeyMap.floorKey(num); // ищем ближайшее число к полученному результату
            st += arabKeyMap.get(arab);
            num -= arab;
        }
        return st;


    }


}


