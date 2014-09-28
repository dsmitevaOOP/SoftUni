<?php
$name = 'Gosho';
$phone = '0882-321-423';
$age = 24;
$address = 'Hadji Dimitar';
?>
<!DOCTYPE html>
<html>
<head>
    <title>HTML Table</title>
    <link rel="stylesheet" href="style/HTMLTable.css" type="text/css" media="screen">
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <td><?php echo $name; ?></td>
    </tr>
    <tr>
        <th>Phone</th>
        <td><?php echo $phone; ?></td>
    </tr>
    <tr>
        <th>Age</th>
        <td><?php echo $age; ?></td>
    </tr>
    <tr>
        <th>Address</th>
        <td><?php echo $address; ?></td>
    </tr>
</table
</body>
</html>
