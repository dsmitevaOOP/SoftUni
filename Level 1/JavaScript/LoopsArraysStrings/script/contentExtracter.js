function extractContent(text) {
    document.getElementById('extract').innerHTML = text;
    var res = document.getElementById('extract').innerText;
    console.log(res.split(/\W+/g).join(''));
}

var tem = "<p>Hello</p><a href='http://w3c.org'>W3C</a>";