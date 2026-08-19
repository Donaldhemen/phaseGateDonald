public class CountCharactersInAString{
    public static void main(String[] args){
        String username = "a11Bacb";
        System.out.println(countCharactersWithMultipleOccurences(username));
    }
    
    public static int countCharactersWithMultipleOccurences(String word){
        word = word.toLowerCase();
        int multipleOccurance = 0;
        for(int count = 0; count < word.length(); count++){
            int counter = 0;
            for(int index = 0; index < word.length(); index++){
                if(word.charAt(count) == word.charAt(index)){
                    counter++;
                    if(counter >= 2){
                        multipleOccurance++;
                    }
                }
            }
        }
        return multipleOccurance;
    }
}
