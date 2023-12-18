package animal.animal;

public class Dog {
    public double tail = 0;
    public double getTail(){
        return tail;
    }
    public boolean setTail(double tail){
        boolean result = false;
        if (tail>0){
            this.tail = tail;
            return result = true;
        }
        return result;
    }

public double cutTail(){
    tail = tail-1;
    return tail;
    }}
