<!DOCTYPE html>
<html>
<head>
    <title>Form Data</title>
    <link rel="stylesheet" href="style/FormData.css" type="text/css" media="screen">
</head>
<body>
<form action="#" method="POST">
    <input type="text" name="name" id="name" placeholder="Name..." />
    <input type="text" name="age" id="age" placeholder="Age..." />
    <input type="radio" name="sex" id="male" value="male"/>
    <label for="male">Male</label>
    <input type="radio" name="sex" id="female" value="female"/>
    <label for="female">Female</label>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
<?php
if ($_SERVER['REQUEST_METHOD'] === "POST" && isset($_POST["name"]) && isset($_POST["age"]) && isset($_POST["sex"])) {
    echo "My name is " . $_POST["name"] . " I am " . $_POST["age"] . " years old. " . " I am " . $_POST["sex"] . ".";
}
?>


