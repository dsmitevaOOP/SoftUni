<!DOCTYPE html>
<html>
<head>
    <title>Print Tags</title>
</head>
<body>
<form action="#" method="POST">
    <label for="amount">Enter Amount</label>
    <input type="text" id="amount" name="amount"/>
    <input type="radio" id="USD" value="USD" name="curr"/>
    <label for="USD">USD</label>
    <input type="radio" id="EUR" value="EUR" name="curr"/>
    <label for="EUR">EUR</label>
    <input type="radio" id="BGN" value="BGN" name="curr"/>
    <label for="BGN">BGN</label>
    <label for="int">Compound Interest Amount</label>
    <input type="text" id="int" name="int"/>
    <select name="per">
        <option value="6 Months">6 Months</option>
        <option value="1 Year">1 Year</option>
        <option value="2 Years">1 Year</option>
        <option value="5 Years">5 Year</option>
    </select>
    <input type="submit" value="Calculate" name="submit"/>
</form>
</body>
</html>

<?php
// ----- set mb_http_output encoding to UTF-8 -----
mb_http_output('UTF-8');

// ----- setup php for working with Unicode data -----
mb_internal_encoding('UTF-8');
mb_http_output('UTF-8');
mb_http_input('UTF-8');
mb_language('uni');
mb_regex_encoding('UTF-8');
ob_start('mb_output_handler');


if($_POST && isset($_POST['submit'])) {

    $amount = (int)($_POST['amount']);
    $cur = $_POST['curr'];
    $interest = (double)$_POST['int'] / 100;
    $per = $_POST['per'];
    $perType = substr($per, 2, 4);

    if ($perType === 'Mont') {
        $perM = (int) $per[0];
    }
    else if ($perType === 'Year') {
        $perY = (int) $per[0];
    }

    if(isset($perY) && $perY > 0) {
        $res = pow((1 + $interest), $perY) * $amount;
    }
    else if (isset($perM) && $perM > 0) {
        $intPerM = $interest / 12;
        $res = pow((1 + $intPerM), $perM) * $amount;
    }

    if(isset($res)) {
        $res = number_format($res, 2);

        if ($cur === "USD") {
            echo "$ " . $res;
        }

        if ($cur === "EUR") {
            echo "€ " . $res;
        }

        if ($cur === "BGN") {
            echo $res . " лв";
        }
    }
}
?>