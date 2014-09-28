<!DOCTYPE html>
<html>
<head>
    <title>Text Filter</title>
</head>
<body>
<form action="#" method="POST">
    <textarea name="text"></textarea>
    <input type="text" name="banned"/>
    <input type="submit" value="Filter Text" name="submit"/>
</form>

<div>
<?php
if (isset($_POST['submit']) && !empty($_POST['text']) && !empty($_POST['banned'])) {
    $text = $_POST['text'];
    $banned = explode(", ", $_POST['banned']);

    foreach ($banned as $word) {
        $text = str_replace($word, str_repeat("*", strlen($word)), $text);
    }

    echo ($text);
}
?>
</div>

</body>
</html>