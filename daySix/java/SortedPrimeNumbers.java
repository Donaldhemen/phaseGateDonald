public class SortedPrimeNumbers{
    
    public static void main(String[] args){
    
        int[] array = {5,9,3,4,2};

        System.out.println(getPrimesIn(array));

        System.out.println(sortArrayElements(getPrimes(array))); 
    
    }
    
    public static int checkNumberOfPrimes(int[] array){
        int counter = 0;
        
        for(int index = 0; index < array.length; index++){
            int number = array[index];
            if(isPrime(number)){
                counter++;
            }
        }
        
        return counter;
    }

    public static boolean isPrime(int number){
        boolean isPrime = false;
        int primeCounter = 0;
        
        for(int count = 1; count <= number; count++){
            if(number % count == 0){
                primeCounter++;
            }
        }
        
        if(primeCounter == 2){
            isPrime = true;
        }
        
        return isPrime;
    }

    public static int[] sortArrayElements(int[] array){

        int swap = 0;
        
        for(int index = 0; index < array.length; index++){
            for(int count = 0; count < array.length; count++){
                if(array[index] < array[count]){
                    swap = array[index];
                    array[index] = array[count];
                    array[count] = swap;
                }
            }
        }
        
        return array;
    }

    public static int[] getPrimes(int[] array){

        int [] primesArray = new int [checkNumberOfPrimeIn(array)];
        int counter = 0;
        
        
        for(int index = 0; index < array.length; index++){
            int number = array[index];
            
            if(isPrime(number)){
                primesArray[counter] = array[index];
                counter++;
            }
        }
        
        return array;
    }
    
}


