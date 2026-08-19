public class FindTheAverageOfNumbers{
    public static void main(String[] args){
        int sum = 0;
        for(int count = 1; count <= 100; count++){
            sum += count;
        }
        int average = sum / 101;
        System.out.println("the average of numbers 1 to 100 is "+average);
    }
}
