public class AverageAndGradeOfThreeValues{
    public static void main(String[] args){
        int scoreOne = 70;
        int scoreTwo = 60;
        int scoreThree = 50;
        calculateAverageAndGrade(scoreOne, scoreTwo, scoreThree);
    }
    public static void calculateAverageAndGrade(int numberOne, int numberTwo, int numberThree){
    
        int average = (numberOne + numberTwo + numberThree) / 3;
        
        if(average >= 90){
            System.out.println("The average score is "+average+" and grade is A");
        }
        
        else if(average >= 80){
            System.out.println("The average score is "+average+" and grade is B");
        }
        
        else if(average >= 70){
            System.out.println("The average score is "+average+" and grade is C");
        }
        
        else if(average >= 60){
            System.out.println("The average score is "+average+" and grade is D");
        }
        
        else {
            System.out.println("The average score is "+average+" and grade is F");
        }
    }
}
