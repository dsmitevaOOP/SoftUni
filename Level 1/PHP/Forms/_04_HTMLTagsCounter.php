<?php
session_start();
?>

<!DOCTYPE html>
<html>
<head>
    <title>Print Tags</title>
</head>
<body>
<form action="#" method="POST">
    <label for="text">Enter HTML tags</label>
    <input type="text" id="text" name="tag"/>
    <input type="submit" name="submit"/>
</form>
</body>
</html>

<?php
$tags = array("a", "abbr", "address", "area", "article", "aside", "audio", "b", "base", "bdi", "bdo", "blockquote",
    "body", "br", "button", "canvas", "caption",
    "cite", "code", "col", "colgroup", "command", "datalist", "dd", "del", "details",
    "dfn", "div", "dl", "dt", "em", "embed", "fieldset", "figcaption", "figure",
    "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr",
    "html", "i", "iframe", "img", "input", "ins", "kbd", "keygen", "label",
    "legend", "li", "link", "map", "mark", "menu", "meta", "meter", "nav", "noscript", "object", "
    ol", "optgroup", "option", "output", "p", "param", "pre", "progress",
    "q", "rp", "rt", "ruby", "s", "samp", "script", "section", "select", "small", "source", "span",
    "strong", "style", "sub", "summary", "sup", "table", "tbody", "td",
    "textarea", "tfoot", "th", "thead", "time", "title", "tr", "track", "u", "ul", "var", "video", "wbr");

if(!isset($_SESSION['score']) || !isset($_SESSION['tagsLeft'])) {
    $_SESSION['score'] = 0;
    $_SESSION['tagsLeft'] = $tags;
}

if($_POST && isset($_POST['submit'])) {
    $tag = mb_strtolower(trim($_POST["tag"]));

    if(array_search($tag, $tags) === false) {
        echo 'Invalid HTML tag!' . "</br>";
    }
    else {
        echo 'Valid HTML tag!' . "</br>";

        if(array_search($tag, $_SESSION['tagsLeft']) !== false) {
            $_SESSION['score']++;
            $key = array_search($tag, $tags);
            unset($_SESSION['tagsLeft'][$key]);
        }
    }
}

echo 'Score: ' . $_SESSION['score'];
if ($_SESSION["score"] == count($tags)) {
    echo "You wrote all tags!";
}

?>