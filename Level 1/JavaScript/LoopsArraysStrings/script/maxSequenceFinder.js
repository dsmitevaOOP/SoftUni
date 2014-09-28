function findMaxSequence(arr) {
    var count = 1;
    var length = 1;
    var pos = 0;
    var found = false;
    var res = [];

    for (var i = 1; i < arr.length; i++) {
        if (arr[i - 1] < arr[i]) {
            count++;
        } else {
            count = 1;
        }
        if (count > length) {
            length = count;
            pos = i;
            found = true;
        }
    }

    if (found) {
        for (var j = pos - length + 1; j <= pos; j++) {
            res.push(arr[j]);
        }
        return res;
    }
    else {
        return 'no';
    }
}

console.log(findMaxSequence([3, 2, 3, 4, 2, 2, 4]));
console.log(findMaxSequence([3, 5, 4, 6, 1, 2, 3, 6, 10, 32]));
console.log(findMaxSequence([3, 2, 1]));


