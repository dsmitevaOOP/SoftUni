function reverseWordsInString(str) {
    var arr = str.split(' ');
    var res = [];

    for(var i = 0; i < arr.length; i++) {
        res.push(arr[i].split("").reverse().join(""));
    }

    console.log(res.join(' '));
}
reverseWordsInString('Hello, how are you.');
reverseWordsInString('Life is pretty good, isn’t it?');