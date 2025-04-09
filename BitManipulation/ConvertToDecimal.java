package BitManipulation;

public class ConvertToDecimal {
    public static int dec(String s){
        int len=s.length();
        int num=0;
        int p=0;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                num+=Math.pow(2, p);

                p++;
            }
            else{
                p++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int a=dec("1101");
        System.out.println(a);
    }
}
