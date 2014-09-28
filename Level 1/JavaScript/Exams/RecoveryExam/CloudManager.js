function manage(input) {
    var n = input.length,
        arr = {},
        catArr = [];

    for (var i = 0; i < n; i++) {
        var tempRow = input[i].split(' ');
        var name = tempRow[0];
        var cat = tempRow[1];
        var size = parseFloat(tempRow[2]);

        if (!(cat in arr)) {
            catArr.push(cat);
            arr[cat] = {};
            arr[cat]['files'] = [];
            arr[cat]['files'].push(name);
            arr[cat]['memory'] = size;
        } else if (cat in arr) {
            arr[cat]['files'].push(name);
            arr[cat]['memory'] += size
        }
    }

    function sortObjectProperties(obj) {
        var keysSorted = Object.keys(obj).sort();
        var sortedObj = {};
        for (var i = 0; i < keysSorted.length; i++) {
            var key = keysSorted[i];
            sortedObj[key] = obj[key];
        }
        return sortedObj;
    }

    for(var i = 0; i < catArr.length; i++) {
      arr[catArr[i]]['files'].sort();;
       arr[catArr[i]]['memory'] =  arr[catArr[i]]['memory'].toFixed(2);
    }

    arr = sortObjectProperties(arr);
    var json = JSON.stringify(arr);
    console.log(json);
}



