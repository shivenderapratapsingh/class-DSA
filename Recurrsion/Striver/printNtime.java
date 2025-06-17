package Striver;

public class printNtime {
    public static void print(int i,int n){
        if(i>n) return;
        System.out.println("Shivaay");
        print(i+1, n);

    }

    public static void linear(int i,int n){
        if(i>n) return;
        System.out.println(i);
        linear(i+1, n);
    }

    public static void linear2(int n){
        if(n==0) return;
        linear2(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(1, 4);
        linear(1, 4);
        linear2(5);
        
    }
    
}
