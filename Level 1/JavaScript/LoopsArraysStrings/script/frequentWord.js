function findMostFreqWord(text) {
    var input = text.toLowerCase().split(/\W+/g);
    var count = 0;
    var res = [];
    var temp = [];
    var pos;

    for (var i = 0; i < input.length; i++) {
        var word = input[i];
        var found = false;

        for(var j = 0; j < res.length; j++) {
            if(res[j].word === word) {
                res[j].count++;
                found = true;
            }
        }

        if(found === false) {
            res.push(input[i]);
            res[res.length - 1] = {word: word, count: 1};
        }
    }



    for (var p = 0; p < res.length; p++) {
        if (res[p].count >= count) {
            count = res[p].count;
            pos = p;
        }
    }

    for (var p = 0; p < res.length; p++) {
        if (res[p].count >= count) {
           temp.push(res[p]);
        }
    }

    temp.sort(
        function (lhs, rhs) {
            return lhs.word.localeCompare(rhs.word);
        }
    );

    for (var i = 0; i < temp.length; i++) {
        console.log(temp[i].word + ' -> ' + temp[i].count);
    }
}

findMostFreqWord('in the middle of the night');
findMostFreqWord('Welcome to SoftUni. Welcome to Java. Welcome everyone.');
findMostFreqWord('Hello my friend, hello my darling. Come on, come here. Welcome, welcome darling.');