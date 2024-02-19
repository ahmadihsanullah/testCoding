function polindrome(data){
    data = data.toLowerCase();
    for(i = 0; i < data.length/2 ; i++){
        if(data[i] != data[data.length - i -1]){
            return false;
        }
    }
    return true
}
console.log("polindrome")
console.log(polindrome("mALam"))
console.log(polindrome("ini"))


console.log("!polindrome")
console.log(polindrome("aku"))
console.log(polindrome("uka"))