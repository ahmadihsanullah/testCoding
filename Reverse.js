function reverse(data){

    for(i = 0; i < data.length/2; i++){
        let temp = data[i];
        data[i] = data[data.length - i - 1];
        data[data.length - i - 1] = temp;
    }
    return data;
}
let numbers = [1,2,3];
console.log(reverse(numbers))