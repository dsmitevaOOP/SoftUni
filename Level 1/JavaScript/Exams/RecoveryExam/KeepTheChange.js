function change (input) {
    var bill = Number(input[0]),
        mood = input[1],
        tip = 0;


    switch (mood) {
        case "happy":
            tip = 10 * bill / 100;
            tip = tip.toFixed(2);
            break;
        case "married":
            tip = 0.05 * bill / 100;
            tip = tip.toFixed(2);
            break;
        case "drunk":
            tip = 15 * bill / 100;
            var digit = Number (tip.toString()[0]);
            tip = Math.pow(tip, digit);
            tip = tip.toFixed(2);
            break;
        default:
            tip = 5 * bill / 100;
            tip = tip.toFixed(2);
    }

    console.log(tip);
}



