function findMaxSequence(arr) {

    var count = 1;
    var length = 1;
    var pos = 0;
    var res = [];

    for (var i = 1; i < arr.length; i++) {
        if (arr[i] === arr[i - 1]) {
            count++;
        } else {
            count = 1;
        }
        if (count >= length) {
            length = count;
            pos = i;
        }
    }
    for (var j = 0; j < length - 1; j++) {
        res.push(arr[pos]);
    }
    res.push(arr[pos]);
    return res;
}

console.log(findMaxSequence([2, 1, 1, 2, 3, 3, 2, 2, 2, 1]));
console.log(findMaxSequence(['happy']));
console.log(findMaxSequence([2, 'qwe', 'qwe', 3, 3, '3']));
