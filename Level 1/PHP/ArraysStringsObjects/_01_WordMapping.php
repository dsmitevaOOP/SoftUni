<!DOCTYPE html>
<html>
<head>
    <title>Word Mapping</title>
    <style>
        table, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<form action="#" method="POST">
    <textarea name="input"></textarea>
    <input type="submit" value="Count Words" name="submit"/>
</form>

<div>
    <?php
    if (isset($_POST['submit']) && !empty($_POST['input'])) {
        $input = $_POST['input'];
        if (isset($input)) {
            $splitInput = strtolower($input);
            $splitInput = preg_replace("/[^\w\ _]+/", '', $splitInput);
            $splitInput = preg_split("/\s+/", $splitInput);
            $counts = array_count_values($splitInput);
            echo "<table>";
            foreach ($counts as $key => $value) {
                echo "<tr><td>$key</td><td>$value</td></tr>";
            }
            echo "</table>";
        }
    }
    ?>
</div>

</body>
</html>