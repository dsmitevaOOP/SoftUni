<!DOCTYPE html>
<html>
<head>
    <title>Text Colorer</title>
</head>
<body>
<form action="#" method="POST">
    <input type="text" name="input"/>
    <input type="submit" value="Color Text" name="submit"/>
</form>

<div>
    <?php
    if (isset($_POST['submit'])) {
        if (!empty($_POST['input'])) {
            $input = $_POST['input'];
            $splitInput = str_split($input);
            foreach ($splitInput as $char) {
                $code = ord($char);

                if ($code % 2 === 0) {
                    echo "<span style=\"color: red\">$char</span>";
                }
                else {
                    echo "<span style=\"color: blue\">$char</span>";
                }
            }
        }
    }
    ?>
</div>

</body>
</html>