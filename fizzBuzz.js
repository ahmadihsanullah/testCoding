function fizzBuzz(data){
    if(data % 15 == 0){
        console.log("fizzBuzz")
    }else if(data % 3 == 0){
        console.log("fizz");
    } else if (data % 5 == 0){
        console.log("buzz")
    }else{
        console.log(data);
    }
}

function isFizzBuzz(){
    for(i = 1 ; i < 100 ; i ++){
        fizzBuzz(i);
    }
}

isFizzBuzz();