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
if($_POST && isset($_POST['tags'])) {
    $tags = explode(", ", $_POST['tags']);

    $tagCount = array();
    foreach($tags as $tag) {
        if(!isset($tagCount[$tag])) {
            $tagCount[$tag] = 1;
        }
        else {
            $tagCount[$tag]++;
        }
    }

    arsort($tagCount);
    foreach($tagCount as $key => $value){
        echo ($key . " : " . $value . " time" . ($value == 1 ? "" : "s")) . "</br>";
    }

    echo "Most frequent tag is : " . array_keys($tagCount)[0];
}
?>