public class ReverseAString{
    public static void main(String[] args){
        String name = "Donald";
        System.out.println(getTheReverseOf(name));
    }
    public static String getTheReverseOf(String word){
        String reversed = "";
        for(int count = word.length() -1; count >= 0; count--){
            reversed = reversed + word.charAt(count);
            
        }
        return reversed;
        
    }
}

