function sortArray(arr) {
    var res = [];
    var count = 0;

    for (var i = 0; i < arr.length - 1; i++) {
        var min = i;
        for (var j = i + 1; j < arr.length; j++) {
            if(arr[j] < arr[min]) {
                min = j;
            }
        }

        if (min != i) {
            var temp = 0;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    return arr;
}

console.log(sortArray([5, 4, 3, 2, 1]));
console.log(sortArray([12, 12, 50, 2, 6, 22, 51, 712, 6, 3, 3]));
