function bitChecker(value) {
    var mask = 1 << 3;
    var res = (mask & value) >> 3;
    if(res) {
        console.log(true);
    }
    else {
        console.log(false);
    }
}

bitChecker(333);
bitChecker(425);
bitChecker(2647564754);

