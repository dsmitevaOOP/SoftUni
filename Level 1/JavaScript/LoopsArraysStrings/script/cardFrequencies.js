function findCardFrequency(text) {
    var input = text.split(' ');
    var res = [];

    for (var i = 0; i < input.length; i++) {
        var word = input[i][0];
        var found = false;

        for(var j = 0; j < res.length; j++) {
            if(res[j].word[0] === word) {
                res[j].count++;
                found = true;
            }
        }

        if(found === false) {
            res.push(input[i]);
            res[res.length - 1] = {word: word, count: 1};
        }
    }

    for (var i = 0; i < res.length; i++) {
        var fr = res[i].count / input.length * 100;
        fr = fr.toFixed(2);
        res[i].freq = fr;
    }

    for (var i = 0; i < res.length; i++) {
       console.log(res[i] + ' -> ' + res[i].freq);
    }
}

findCardFrequency('8♥ 2♣ 4♦ 10♦ J♥ A♠ K♦ 10♥ K♠ K♦');
findCardFrequency('J♥ 2♣ 2♦ 2♥ 2♦ 2♠ 2♦ J♥ 2♠');
findCardFrequency('10♣ 10♥');