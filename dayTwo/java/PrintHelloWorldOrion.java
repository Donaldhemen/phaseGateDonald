// multiple of 3 print hello
// multiple of 5 print world
// multiple of 7 print orion
// else print digit revesed

public class PrintHelloWorldOrion{
    public static void main(String[] args){
        
        String multipleOfThree = "hello";
        String multipleOfFive = "world";
        String multipleOfSeven = "orion";
        int reversed = 0;
        for(int count = 1; count <= 100; count++){
            
            if(count % 3 == 0){
                System.out.print(multipleOfThree+" ");
            }
            else if(count % 5 == 0){
                System.out.print(multipleOfFive+" ");
            }
            else if(count % 7 == 0){
                System.out.print(multipleOfSeven+" ");
            }
            else{
                if(count >= 10){
                    reversed = (count % 10) * 10 + (count / 10);
                    System.out.print(reversed+" ");
                }
                else{
                    System.out.print(count+" ");
                }
            }
            System.out.println();
        }
    }
}
