function findMinAndMax(value) {
    var min = Math.min.apply(Math, value);
    var max = Math.max.apply(Math, value);
    console.log('Min-> ' + min + ' Max-> ' + max);
}

findMinAndMax([1, 2, 1, 15, 20, 5, 7, 31]);
findMinAndMax([2, 2, 2, 2, 2]);
findMinAndMax([500, 1, -23, 0, -300, 28, 35, 12]);