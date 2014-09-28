<!DOCTYPE html>
<?php
function sum ($str) {
    if (ctype_digit($str)) {
        $res = str_split($str);
        $sum = array_sum($res);
        return $sum;
    }
    else {
        return "I cannot sum that";
    }
}
?>
<html>
<head>
    <title>Sum of Digits</title>
    <style>
        table, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<form action="#" method="post">
    <label for="input">Input string:</label>
    <input type="text" id="input" name="input"/>
    <input type="submit" name="submit">
</form>

<div>
    <table>
<?php
if (isset($_POST['submit']) && !empty($_POST['input'])) {
    if (isset($_POST['input'])) {
        $input = $_POST['input'];
        $splitInput = explode(', ', $input);
        for($i = 0; $i < count($splitInput); $i++) {
            $res = sum($splitInput[$i]);
            echo "<tr><td>$splitInput[$i]</td><td>$res</td></tr>";
        }
    }
    echo "</table>";
}
?>
</div>

</body>
</html>