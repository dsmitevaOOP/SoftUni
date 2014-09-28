function printNumbers(num) {

    var line = "";

    for (var i = 1; i <= num; i++) {
        if(i % 4 !== 0 && i % 5 !== 0) {
            line = line + i + ", ";
        }
    }

    if(num > 1) {
        console.log(line);
    }
    else {
        console.log("no");
    }
}

printNumbers(20);
printNumbers(1);
printNumbers(13);