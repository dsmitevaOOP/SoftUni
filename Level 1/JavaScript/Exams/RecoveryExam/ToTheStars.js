function stars (input) {
    var systems = [],
        tempInput = input[3].split(" "),
        initial = {x: Number(tempInput[0]), y: Number(tempInput[1])},
        moves = Number(input[4]);

    for (var i = 0; i < 3; i++) {
        var temp = input[i].split(" ");
        var starSystem = {name: temp[0], x: Number (temp[1]), y: Number (temp[2])};
        systems.push(starSystem);
    }

    for (var j = 0; j < moves + 1; j++) {
        if ((initial.x >= systems[0].x - 1) && (initial.x <= systems[0].x + 1)
            && (initial.y >= systems[0].y - 1) && (initial.y <= systems[0].y + 1)) {
            console.log(systems[0].name.toLowerCase());
        }

        else if ((initial.x >= systems[1].x - 1) && (initial.x <= systems[1].x + 1)
            && (initial.y >= systems[1].y - 1) && (initial.y <= systems[1].y + 1)) {
            console.log(systems[1].name.toLowerCase());
        }

        else if ((initial.x >= systems[2].x - 1) && (initial.x <= systems[2].x + 1)
            && (initial.y >= systems[2].y - 1) && (initial.y <= systems[2].y + 1)) {
            console.log(systems[2].name.toLowerCase());
        }

        else {
            console.log("space");
        }

        initial.y++;
    }
}
