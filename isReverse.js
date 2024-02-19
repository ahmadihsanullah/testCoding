function reverseArray(data){
    for(i = 0; i< data.length /2; i++){
        let temp = data[i];
        data[i] = data[data.length - i -1];
        data[data.length - i - 1]  = temp;
    }

    return data;
}

let words = ['a','b','c','d'];
console.log(reverseArray(words));