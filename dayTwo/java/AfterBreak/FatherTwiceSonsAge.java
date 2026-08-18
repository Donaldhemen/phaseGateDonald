// yearstodouble = fathersAge - 2*sonsAge
public class FatherTwiceSonsAge{
    public static void main(String[] args){
        int fathersAge = 38;
        int sonsAge = 18;
        isDoubleSonsAge(fathersAge, sonsAge);
    }
    public static void isDoubleSonsAge(int numberOne, int numberTwo){
        int yearsToDouble = 0;
        if(numberOne/2 > numberTwo){
            yearsToDouble = numberOne - (numberTwo * 2);
            System.out.println("The father was twice his son's age "+yearsToDouble+" years ago");
        }
        else{
            yearsToDouble = (numberTwo * 2) - numberOne;
            System.out.println("The father will be twice his son's age in "+yearsToDouble+" years time");
        }
        
    }
}
