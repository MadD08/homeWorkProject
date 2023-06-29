package homeWorks.homeWork6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayListClass {
    static ArrayList<String> books = new ArrayList<String>(Arrays.asList("First","Second","Third","Fourth","Fifth"));

    private static HashMap<String, Integer> convertToHashMap(ArrayList<String> arrayList){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String name : arrayList){
            hashMap.put(name, arrayList.indexOf(name));
        }
        return hashMap;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> booksMap = convertToHashMap(books);
        System.out.println(booksMap);
    }
}
