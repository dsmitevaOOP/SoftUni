function findLargestBySumOfDigits(nums) {
    var re = new RegExp(",", 'g');
    var input = nums.replace(re, '').split(" ");
    var res = 0;
    var num;

    for(var i = 0; i < input.length; i++) {

        var temp = 0;

        for(var j = 0; j < input[i].length; j++) {
            if(input[i][j] === '-') {
                continue;
            }

            if(input[i].charAt(j) === '.') {
                return undefined;
            }

           temp = temp + parseInt(input[i].charAt(j));
        }


        if(temp > res) {
            res = temp;
            num = input[i];
        }
    }

    return num;
}

console.log(findLargestBySumOfDigits('5, 10, 15, 111'));
console.log(findLargestBySumOfDigits('33, 44, -99, 0, 20'));
console.log(findLargestBySumOfDigits('hello'));
console.log(findLargestBySumOfDigits('5, 3.3'));