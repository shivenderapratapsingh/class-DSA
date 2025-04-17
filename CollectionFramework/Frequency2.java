package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Frequency2 {
  
    public static void main(String[] args) {
        // Example primitive array
        int[] nums = {1, 2, 3, 4};  

        // Convert primitive array to List<Integer>
        List<Integer> list = Arrays.stream(nums)      // IntStream
                                   .boxed()           // Box the int to Integer
                                   .collect(Collectors.toList());  // Collect to List

        System.out.println(list);  // Output: [1, 2, 3, 4]

        //simnple method use this 
        //for(int a:nums){
        // list.add(a);
        // }

        // you can also write in this form
        // List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
  
}

}
// 1. For Arrays of Unknown Type (e.g., Object[])
// If you're dealing with an array where you don’t know the type (like an array of mixed types or an Object[]), you can handle it dynamically using generics and casting. Here's how you can work with arrays of unknown types:
// Object[] arr = {1, "Hello", 3.14, true};  // Mixed types: Integer, String, Double, Boolean

// // Convert Object[] to List
// List<Object> list = Arrays.asList(arr);

// System.out.println(list);  // Output: [1, Hello, 3.14, true]

