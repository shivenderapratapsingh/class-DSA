public class Question28 {
    int arr[];
    int size;
    int t1,t2;
    Question28(){
        size=100;
        arr=new int[100];
        t1=-1;
        t2=size;
    }

    void push1(int x){
        if(t2-t1>1) arr[++t1]=x;
    }

    void push2(int x){
        if(t2-t1>1) arr[--t2]=x;
    }

    int pop1(int x){
        if(t1>=0){
            int a=arr[t1--];
        return a;  
        } 
        return -1;
    }

    int pop2(int x){
        if(t2<size){
            int a=arr[t2++];
            return a;
        }
        return -1;
    }
}
