<!DOCTYPE html>
<html>
<head>
    <title>Print Tags</title>
</head>
<body>
<form action="#" method="POST">
    <input type="text" name="tags"/>
    <input type="submit"/>
</form>
</body>
</html>

<?php
$counter = 0;
if (isset($_POST['tags'])) {
$tags = htmlentities($_POST['tags']);
$tagsArr = explode(", ", $tags);
foreach($tagsArr as $value) {
    echo "$counter : $value" . "</br>";
    $counter++;
}
}
?>