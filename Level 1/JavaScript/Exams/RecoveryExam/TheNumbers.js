function numbers (input) {
    var patt = new RegExp("[0-9]+","g"),
        numbArrStr = input[0].match(patt),
        tempArr = [],
        res = '';

    for (var i = 0; i < numbArrStr.length; i++) {
        var temp = (Number (numbArrStr[i])).toString(16);
        var zer = "";

        if (temp.length < 4) {
            var zeros = 4 - temp.length;
            for (var j = 0; j < zeros; j++) {
                zer = zer + 0;
            }
            temp = zer + temp;
        }

        temp = temp.toUpperCase();
        temp = "0x" + temp;
        tempArr.push(temp);
    }

    for (var i = 0; i < tempArr.length; i++) {
        if (i == tempArr.length - 1) {
            res = res + tempArr[i];
        }
        else {
            res = res + tempArr[i] + "-";
        }
    }
}


