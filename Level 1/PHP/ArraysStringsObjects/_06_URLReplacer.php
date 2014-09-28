<!DOCTYPE html>
<html>
<head>
    <title>URL Replacer</title>
</head>
<body>
<form action="#" method="POST">
    <textarea name="input"></textarea>
    <input type="submit" value="Replace URL" name="submit"/>
</form>

<div>
    <?php
    if (isset($_POST['submit']) && !empty($_POST['input'])) {
        $input = $_POST['input'];

        $input = str_replace('</a>', '[/URL]', $input);
        $input = preg_replace('/<a href="(.*?)">/', '[URL=\1]', $input);
        echo htmlentities($input);
    }
    ?>
</div>

</body>
</html>