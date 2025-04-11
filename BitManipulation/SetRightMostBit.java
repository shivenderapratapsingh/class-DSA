package BitManipulation;

public class SetRightMostBit {
    static int setBit(int n) {
        n= n | n+1;
        return n;
    }
}
