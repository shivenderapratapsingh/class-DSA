package HashMap;

import java.util.*;
public class FrequencySort {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 3, 2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Sort the array based on frequency and then by value  
        ArrayList<Integer> list=new ArrayList<>();
        for(int key:map.keySet()){
            list.add(key);
        }
        Collections.sort(list,new Comparator<Integer>() {
            @Override
            public int compare(Integer a,Integer b){
                if(map.get(a)==map.get(b)) return a-b;
                else{
                    if(map.get(a)>map.get(b)) return -1;
                    else return -1;
                }
            }
            
        });
        System.out.println(list);
        for(int x:list){
            System.out.print(x+" ");
        }


        
    }
}
