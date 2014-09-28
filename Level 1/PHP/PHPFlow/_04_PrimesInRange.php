<!DOCTYPE html>
<?php
function prime($number)
{
    if ($number <= 1) {
        return false;
    } elseif ($number == 2) {
        return true;
    } else if ($number % 2 == 0) {
        return false;
    } else if ($number % 3 == 0 && $number !== 3) {
        return false;
    } else {
        for ($i = 3; $i <= ceil(sqrt($number)); $i += 2) {
            if ($number % $i === 0) {
                return false;
            }
        }
        return true;
    }
}
?>
<html>
<head>
    <title>Primes in Range</title>
</head>
<body>
<form action="#" method="post">
    <label for="start">Starting Index:</label>
    <input type="text" id="start" name="start"/>
    <label for="end">End:</label>
    <input type="text" id="end" name="end"/>
    <input type="submit" name="submit"/>
</form>

<?php
if (isset($_POST['submit']) && !empty($_POST['start']) && !empty($_POST['end'])) {
    $start = $_POST['start'];
    $end = $_POST['end'];

    if (isset($start) && isset($end)) {
        if($start < $end) {
            $res = array();
            for ($i = $start; $i <= $end; $i++) {
                $res[] = prime($i) ? "<strong>$i</strong>" : $i;
            }

            echo implode(", ", $res);
        }
        else {
            echo "The start number must be less than the end number.";
        }
    } else {
        echo "The start and end number are required.";
    }
}
?>

</body>
</html>