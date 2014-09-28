<!DOCTYPE html>

<?php
function palindrome ($str) {
    $reverse = strrev($str);
    if ($reverse === $str) {
        return "$str is a palindrome!";
    }
    else {
        return "$str is not a palindrome!";
    }
}

function rev ($str) {
    return strrev ($str);
}

function splitStr ($str) {
    return implode(" ", str_split($str));
}

function hashStr ($str) {
    return crypt($str);
}

function shuffleStr ($str) {
    return str_shuffle($str);
}
?>

<html>
<head>
    <title>String Modifier</title>
</head>
<body>
<form action="#" method="post">
    <input type="text" name="input"/>
    <input type="radio" id="palindrome" value="palindrome" name="choice"/>
    <label for="palindrome">Check Palindrome</label>
    <input type="radio" id="reverse" value="reverse" name="choice"/>
    <label for="reverse">Reverse String</label>
    <input type="radio" id="split" value="split" name="choice"/>
    <label for="split">Split</label>
    <input type="radio" id="hash" value="hash" name="choice"/>
    <label for="hash">Hash String</label>
    <input type="radio" id="shuffle" value="shuffle" name="choice"/>
    <label for="shuffle">Shuffle String</label>
    <input type="submit" name="submit"/>
</form>

<div>
    <?php
    if (isset($_POST['submit']) && !empty($_POST['input'])) {
        $input = $_POST['input'];
        if(isset($input) && isset($_POST['choice'])) {
            $choice = $_POST['choice'];
            if ($choice === "palindrome") {
                echo (palindrome($input));
            }
            else if ($choice === "reverse") {
                echo (rev($input));
            }
            else if ($choice === "split") {
                echo (splitStr($input));
            }
            else if ($choice === "hash") {
                echo (hashStr($input));
            }
            else if ($choice === "shuffle") {
                echo (shuffleStr($input));
            }
        }
    }
    ?>
</div>
</body>
</html>