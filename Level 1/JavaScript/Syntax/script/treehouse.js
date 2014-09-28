function treeHouseCompare(a, b) {
    var house = a * a + (a * 2 / 3 * a) / 2;
    house = house.toFixed(2);
    var tree = b / 3 * b + (Math.PI * 2 / 3 * b * 2 / 3 * b);
    tree = tree.toFixed(2);

    if (house > tree) {
        console.log("house/" + house);
    }
    else {
        console.log("tree/" + tree);
    }
}

treeHouseCompare(3, 2);
treeHouseCompare(3, 3);
treeHouseCompare(4, 5);
