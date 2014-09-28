function checkBrackets (str) {
    var brack = [];
    var bool = true;

    for(var i = 0;  i < str.length; i++) {
        if(str.charAt(i) === ')' || str.charAt(i) === '(') {
            brack.push(str.charAt(i));
        }
    }
    if(brack[0] === ')' || brack[brack.length - 1] === '(' || brack.length % 2 !== 0) {
        bool = false;
    }

    if(bool) {
        return 'correct';
    }
    else {
        return 'incorrect';
    }
}

console.log(checkBrackets('( ( a + b ) / 5 – d )'));
console.log(checkBrackets(') ( a + b ) )'));
console.log(checkBrackets('( b * ( c + d *2 / ( 2 + ( 12 – c / ( a + 3 ) ) ) )'));
