public class CountLeapYearsBetween1900To2025{
    
    public static void main(String[] args){
        
        int startingYear = 1900;
        int endingYear = 2025;
        int count = 0;
        
        for(int year = startingYear; year <= endingYear; year++){
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){

                count++;
            }
        }
        System.out.println(count);
        
    }
}
