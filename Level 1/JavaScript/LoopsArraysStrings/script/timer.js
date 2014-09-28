function daysBetween(firstDate, secDate) {

    var oneDay = 60 * 60 * 24;

    var from = firstDate.getTime();
    var to = secDate.getTime();

    var period = Math.abs(from - to);
    var res = Math.round(period / 1000).toString();
    var temp = res;
    var s = temp - Math.floor (temp / 60) * 60;
    temp = Math.round(temp / 60);
    var m = temp - Math.floor(temp / 60) * 60;
    temp = Math.round(temp / 60);
    var h = temp - Math.floor(temp / 24) * 24;
    temp = Math.floor(temp / 24);
    var y = Math.floor(temp / 365);
    temp = temp - Math.floor(y * 365);
    var mon = Math.floor(temp / 30);
    temp = temp - Math.floor(mon * 30);
    var d = temp;

    document.getElementById('timer').innerHTML = d.toString() + ':' + m.toString() + ':' + y.toString() + ' ' + res;
}

var secDate = new Date();
var firstDate = new Date();

firstDate.setDate(30);
firstDate.setMonth(5);
firstDate.setYear(2015);
firstDate.setHours(23);
firstDate.setMinutes(59);
firstDate.setSeconds(59);

secDate.setDate(27);
secDate.setMonth(7);
secDate.setYear(2014);
secDate.setHours(0);
secDate.setMinutes(49);
secDate.setSeconds(39);


daysBetween(firstDate, secDate);