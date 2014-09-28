function findNthDigit(arr) {
    var num = arr[1].toString().replace(".", "").replace("-", '');
    var pos = arr[0];

    if(num.length < pos) {
        console.log(undefined);
    }
    else {

        var numPos = num.charAt(num.length - pos);

        switch (numPos) {
            case '0':
                console.log("0");
                break;
            case '1':
                console.log("1");
                break;
            case '2':
                console.log("2");
                break;
            case '3':
                console.log("3");
                break;
            case '4':
                console.log("4");
                break;
            case '5':
                console.log("5");
                break;
            case '6':
                console.log("6");
                break;
            case '7':
                console.log("7");
                break;
            case '8':
                console.log("8");
                break;
            case'9':
                console.log("9");
                break;
            default:
                console.log("NaN");
                break;
        }
    }
}


findNthDigit([1, 6]);
findNthDigit([2, -55]);
findNthDigit([6, 923456]);
findNthDigit([3, 1451.78]);
findNthDigit([6, 888.88]);