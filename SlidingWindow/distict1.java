package SlidingWindow;

public class distict1 {
    public static boolean dis(int a){
        int no=1;
        for(int i=0;i<a;i++){
            no*=2;
            if(no==a){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(dis(16));
    }
}
