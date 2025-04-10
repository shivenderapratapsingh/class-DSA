package BitManipulation;

public class SetGetClear {
          // (1-based index)
        static void bitManipulation(int num, int i) {
            // get ith bit 
            int ith = 0;
            if ((num & (1 << (i - 1))) != 0) {
                ith = 1;
            }
    
            // set ith bit
            int a = num | (1 << (i - 1));
    
            // clear ith bit
            int c = num & ~(1 << (i - 1));
    
            System.out.print(ith + " " + a + " " + c);
        }
    
}
