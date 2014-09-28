function reverseString(str) {
    var res = [];

    for (var i = str.length - 1; i >= 0; i--) {
        res.push(str.charAt(i));
    }
    res = res.join('');
    return res;
}

console.log(reverseString('sample'));
console.log(reverseString('softuni'));
console.log(reverseString('java script'));
