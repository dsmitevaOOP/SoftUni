function lastDigitAsText(numb) {
    var res = numb % 10;

    if(res < 0) {
        res = res * (-1);
    }

    switch(res) {
        case 0: console.log("null");
            break;
        case 1: console.log("one");
            break;
        case 2: console.log("two");
            break;
        case 3: console.log("three");
            break;
        case 4: console.log("four");
            break;
        case 5: console.log("five");
            break;
        case 6: console.log("six");
            break;
        case 7: console.log("seven");
            break;
        case 8: console.log("eight");
            break;
        case 9: console.log("nine");
            break;
        default: console.log("NaN");
            break;
    }
}

lastDigitAsText(6);
lastDigitAsText(-55);
lastDigitAsText(133);
lastDigitAsText(14567);
