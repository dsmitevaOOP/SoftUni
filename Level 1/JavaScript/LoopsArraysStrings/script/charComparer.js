function compareChars(arrf, arrs) {
    var equal = true;

    if(arrf.length === arrs.length) {
        for(var i = 0; i < arrf.length; i++) {
            if (arrf[i] !== arrs[i])
            equal = false;
            break;
        }
    }
    else {
        equal = false;
    }

    if(equal) {
        console.log('Equal');
    }
    else {
        console.log('Not Equal')
    }
}

compareChars(['1', 'f', '1', 's', 'g', 'j', 'f', 'u', 's', 'q'], ['1', 'f', '1', 's', 'g', 'j', 'f', 'u', 's', 'q']);
compareChars(['3', '5', 'g', 'd'], ['5', '3', 'g', 'd']);
compareChars(['q', 'g', 'q', 'h', 'a', 'k', 'u', '8', '}', 'q', '.', 'h', '|', ';'], ['6', 'f', 'w', 'q', ':', '”', 'd', '}', ']', 's', 'r']);
