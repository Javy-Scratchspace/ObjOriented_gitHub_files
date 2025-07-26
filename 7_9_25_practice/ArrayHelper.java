
public class ArrayHelper {
    
    public double start; // start of our array
    public double end; 
    public double interval; // can be edited per object
    public double[] arr; 
    double sum; 
    double min; 
    double max; 
    int capacity; 

    ArrayHelper() {
        this.start = 0;
        this.end = 10;
        this.interval = 1; 
        ArrayGenerator();
    }

    ArrayHelper(double start, double end, double interval) {
        this.start = start; 
        this.end = end; 
        this.interval = interval; 
        ArrayGenerator();
    }

    private void ArrayGenerator() {
        if (this.end < this.start) {
            return;
        }
        
        for (double i = this.start; i <= this.end; i += this.interval) {
            this.capacity++; 
        }

        this.arr = new double[this.capacity];

        double sum = 0; 
        double min = this.start;
        double max = this.start; 
        double start = this.start; 
        for (int i = 0; i < this.capacity; i ++) {
            
            if (min > start) min = start; 
            if (max < start) max = start; 

            sum += this.arr[i];
            this.arr[i] = start; 
            start += this.interval; 
        }

        this.min = min; 
        this.max = max; 
        this.sum = sum; 
    }

    public double getSum() {
        double sum = 0; 
        
        for (int i = 0; i < this.capacity; i ++) {
            sum += this.arr[i];
        }

        return sum; 
    }

    public double getValueAtIndex(int idx) {
        return this.arr[idx];
    }

    public ArrayHelper add(ArrayHelper other) {
        if (this.capacity != other.capacity) {
            return this; 
        }

        ArrayHelper result = new ArrayHelper(this.start, this.end, this.interval);
        double sum = 0; 
        double min = result.start + other.start; 
        double max = result.start + other.start;
        for (int i = 0; i < this.capacity; i ++) {
            result.arr[i] += other.arr[i];
            sum += result.arr[i];

            if (min > result.arr[i]) min = result.arr[i];
            if (max < result.arr[i]) max = result.arr[i];
        }

        result.start = result.arr[0];
        result.end = result.arr[this.capacity-1];
        result.interval = (result.end-result.start)/(result.capacity + 1); 
        result.sum = sum; 
        result.min = min; 
        result.max = max; 

        return result; 
    }

    public double getMax() {
        return  this.max; 
    }

    public double getMin() {
        return this.min;
    }

    public void display() {
        for (int i = 0; i < this.capacity; i ++) {
            System.out.println(this.arr[i]);
        }
    }
}