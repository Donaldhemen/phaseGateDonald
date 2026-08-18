public class FacebookLikesSystem{
    public static void main(String[] args){
        String[] people = {"Donald", "Winnie", "Dotun", "John"};
        getNumberOfLikes(people[]);
    }
    
    public static void getNumberOfLikes(String[] names){
        int index = 0;
        while(true){
            switch(names.length){
                case 0: 
                    System.out.println("no one likes this"); break;
                    
                case 1:
                    System.out.println(names[]+"likes this"); break;
            }
        }
    }
}
