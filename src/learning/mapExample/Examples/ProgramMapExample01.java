package mapExample.Examples;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMapExample01 {
    public static void main (String [] args){
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Maria"); //armazenamento de chave e valor
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "999545769");

        cookies.remove("email"); //removendo a key do map
        cookies.put("phone", "99999-9999");


        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()){
            System.out.println(key + ":  " + cookies.get(key));
        }

    }
}
