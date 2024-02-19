function Reverse(data){
    for(i = 0; i < data.length / 2 ; i ++){
        let temp = data[i];
        data[i] = data[data.length - i - 1];
        data[data.length - i - 1] = temp;
    }
    return data;
}

let words = ['a','b','c'];

// [a, b, c] => keadaan awal
// [c, b, a] => keadaan 1 setelah di reverse
// [c, b, a] => keadaan 2 setelah di reverse {selesai sampe sini}
// [a, b, c] => keadaan 3, balik ke keadaan awal
console.log(Reverse(words));
console.log(Reverse("ahmad"));