<!DOCTYPE html>
<html>
<head>
    <title>Annual Expenses</title>
</head>
<style>
    table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
    }
</style>
<body>
<form action="#" method="POST">
    <label for="exp">Enter number of years</label>
    <input type="text" id="exp" name="exp"/>
    <input type="submit" value="Show costs" name="submit"/>
</form>

<div>
<?php
$year = (int)date('Y');
if (isset($_POST['submit']) && !empty($_POST['exp'])):
    $input = $_POST['exp'];
?>
    <table>
        <thead>
            <tr>
                <th>Year</th>
                <th>January</th>
                <th>February</th>
                <th>March</th>
                <th>April</th>
                <th>May</th>
                <th>June</th>
                <th>July</th>
                <th>August</th>
                <th>September</th>
                <th>October</th>
                <th>November</th>
                <th>December</th>
                <th>Total</th>
            </tr>
        </thead>
        <tbody>
        <?php
        for ($i = $year; $i > $year - $input; $i-- ) {
            $sum = 0;
            echo "<tr>";
            echo "<td>" . $i . "</td>";
            for ($j = 0; $j < 12; $j++) {
                $temp = rand(0, 999);
                $sum += $temp;
                echo "<td>" . $temp . "</td>";
            }
            echo "<td>" . $sum . "</td>";
            echo "</tr>";
         }
        ?>
        </tbody>
    </table>
<?php endif;?>
</div>
</body>
</html>