function setTime() {
    var time = new Date();
    var hours = time.getHours();
    var minutes = time.getMinutes();
    if (minutes < 10) {
        minutes = "0" + minutes;
    }
    return hours + " : " + minutes;
}
console.log(setTime());