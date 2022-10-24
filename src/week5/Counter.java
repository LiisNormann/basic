package week5;

public class Counter {
    private int count;
    private boolean check;

    Counter(int startingValue, boolean check) {
        this.check = check;

        if(check){
            if(!(startingValue < 0)){
                this.count = startingValue;
            }
        } else {
            this.count = startingValue;
        }
    }

    public Counter(int startingValue){
        this.count = startingValue;
        this.check = false;
    }

    public Counter(boolean check){
        this.count = 0;
        this.check = check;
    }

    public Counter(){
        this.count = 0;
        this.check = false;
    }

    public int value(){
        return this.count;
    }

    void increase(){
        this.count++;
    }

    void increase(int increaseAmount){
        if (increaseAmount > 0) {
            this.count += increaseAmount;
        }
    }

    public void decrease(){
        if(this.check){
            if(this.count > 0){
                this.count--;
            }
        } else {
            this.count--;
        }
    }

    public void decrease(int decreaseAmount){
        if(check){
            if(!(this.count - decreaseAmount < 0)){
                this.count -= decreaseAmount;
            }
        } else {
            this.count -= decreaseAmount;
        }
    }
}
