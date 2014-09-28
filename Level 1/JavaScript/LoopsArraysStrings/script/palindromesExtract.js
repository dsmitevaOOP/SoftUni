function findPalindromes(text) {
    var arr = text.toLowerCase().split(/\W+/);
    var res = [];

    for(var i = 0; i < arr.length; i++) {
        var temp = arr[i];
        var rev = temp.split('').reverse().join('');
        if (temp === rev && temp !== "") {
            res.push(temp)
        }
    }
    console.log(res);
}

findPalindromes('There is a man, his name was Bob.');