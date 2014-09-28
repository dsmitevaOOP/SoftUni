function replaceSpaces(text) {
    var re = new RegExp(" ", 'g'); //create a regex to match
    var result = text.replace(re, "");
    console.log(result);
}

replaceSpaces("But you were living in another world tryin' to get your message through");