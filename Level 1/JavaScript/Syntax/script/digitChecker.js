function checkDigit(value) {
    var res = Math.floor(value / 100) % 10;

    if(res === 3) {
        console.log(true);
    }
    else {
        console.log(false);
    }
}

checkDigit(1235);
checkDigit(25368);
checkDigit(123456);