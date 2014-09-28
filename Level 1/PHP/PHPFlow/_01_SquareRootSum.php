<!DOCTYPE html>

<?php
$res = '<table><thead><tr><th>Number</th><th>Square</th></tr></thead>' . '<tbody>';
$sum = 0;

for ($i = 0; $i <=100; $i++){
    if ($i % 2 === 0) {
        $square = round(sqrt($i), 2);
        $sum += $square;
        $res .= "<tr><td>{$i}</td><td>{$square}</td></tr>";
    }
}

$res .= "</tbody><tfoot><tr><td>Total:</td><td>{$sum}</td></tr></tfoot></table>";
?>

<html>
<head>
    <title>Square Root</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<?php
if (isset($res)) {
    echo $res;
}
?>
</body>
</html>