function divisionBy3(value) {
    var n = value.toString();
    var sum = 0;
    for (var i = 0; i < n.length; i++) {
        sum = sum + n.charAt(i);
    }
    if (sum % 3) {
        console.log ('The number is not divided by 3 without reminder');
    }
    else {
        console.log('the number is divided by 3 without reminder');
    }
}

divisionBy3(12);
divisionBy3(189);
divisionBy3(591);

