public class PrintLeapYearsBetween1900To2025{
    
    public static void main(String[] args){
        
        int startingYear = 1900;
        int endingYear = 2025;

        
        for(int year = startingYear; year <= endingYear; year++){
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.print(year+" ");
                
            }
        }
        System.out.println();
        
    }
}
