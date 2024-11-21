
public class DataSet {
    private double sum;
    private double smallest;
    private double largest;
    private int count;

    // Constructor
    public DataSet() {
        sum = 0;
        smallest = Double.MAX_VALUE;
        largest = Double.MIN_VALUE;
        count = 0;
    }

    // Method to add a value
    public void add(double value) {
        sum += value;
        if (value < smallest) {
            smallest = value;
        }
        if (value > largest) {
            largest = value;
        }
        count++;
    }

    // Method to calculate average
    public double getAverage() {
        return count > 0 ? sum / count : 0; // Avoid division by zero
    }

    // Method to get the smallest value
    public double getSmallest() {
        return count > 0 ? smallest : Double.NaN; // Return NaN if no values added
    }

    // Method to get the largest value
    public double getLargest() {
        return count > 0 ? largest : Double.NaN;
    }

    // Method to calculate range
    public double getRange() {
        return count > 0 ? largest - smallest : Double.NaN;
    }
}

