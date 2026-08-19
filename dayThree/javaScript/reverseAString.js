function reverseAString(word){

    let reversed = "";
    for (let count = word.length -1; count >= 0; count--){
        reversed = reversed + word.charAt(count);
    }
    return reversed;
}
//reverseAString();
word = "donald";
console.log(reverseAString(word));
