function sth() {
    likeButton = document.getElementById('like-button');
    var val = likeButton.innerHTML;
    if(val === 'Like') {
        val = 'Unlike';
    }
    else {
        val = 'Like';
    }

    document.getElementById('like-button').innerHTML = val;
}
var likeButton = document.getElementById('like-button');
likeButton.addEventListener('click', sth, false);