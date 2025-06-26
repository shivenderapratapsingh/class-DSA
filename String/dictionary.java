package String;
import java.util.*;
public class dictionary {
 



    public static String[] dictWords(String textInput) {
        List<String> prop=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>();
        String[] words=textInput.toLowerCase().split(" ");
        for(String i:words){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(String check:mp.keySet()){
            if(mp.get(check)>1){
                prop.add(check);
            }
        }



        
        

        return prop.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] result = dictWords(input);
        System.out.println("Result: " + Arrays.toString(result));
        sc.close();
   
}
}

    

