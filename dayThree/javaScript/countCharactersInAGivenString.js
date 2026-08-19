
    
function countCharactersWithMultipleOccurences(word){
    word = word.toLowerCase();
    let multipleOccurance = 0;
    for(let count = 0; count < word.length; count++){
        let counter = 0;
        for(let index = 0; index < word.length; index++){
            if(word.charAt(count) === word.charAt(index)){
                counter++;
                if(counter >= 2){
                    multipleOccurance++;
                }
            }
        }
    }
    return multipleOccurance;
}
    
let username = "a11Bacb";
console.log(countCharactersWithMultipleOccurences(username));
