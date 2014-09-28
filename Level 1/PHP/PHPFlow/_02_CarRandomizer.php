<!DOCTYPE html>
<html>
<head>
    <title>Car Randomizer</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<form action="#" method="POST">
    <label for="cars">Enter cars</label>
    <input type="text" id="cars" name="cars"/>
    <input type="submit" value="Show result" name="submit"/>
</form>

<?php
if (isset($_POST['cars']) && !empty($_POST["cars"])) :
$cars = $_POST['cars'];
$carsArr = explode(", ", $cars);
$colours = ['red', 'blue', 'yellow', 'orange', 'green', 'cyan', 'purple', 'pink', 'black', 'beige', 'white'];
?>

<div>
    <table>
        <thead>
            <tr>
                <th>Car</th>
                <th>Colour</th>
                <th>Count</th>
            </tr>
        </thead>
        <tbody>
        <?php foreach ($carsArr as $car): ?>
            <tr>
                <td><?= $car ?></td>
                <td><?= $colours[array_rand($colours)] ?></td>
                <td><?= rand(1, 5) ?></td>
            </tr>
        <?php endforeach; ?>
        </tbody>
    </table>
    <?php endif; ?>
</div>
</body>
</html>