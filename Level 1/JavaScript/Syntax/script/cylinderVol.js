function calcCylinderVol() {
    var res = arguments[0] * arguments[0] * arguments[1] * Math.PI;
    res = res.toFixed(3);
    console.log(res);
}

calcCylinderVol(2, 4);
calcCylinderVol(5, 8);
calcCylinderVol(12, 3);
