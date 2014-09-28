<!DOCTYPE html>
<html>
<head>
    <title>Sentence Extractor</title>
</head>
<body>
<form action="#" method="POST">
    <textarea name="text"></textarea>
    <input type="text" name="word"/>
    <input type="submit" value="Submit" name="submit"/>
</form>

<div>
    <?php
    if (isset($_POST['submit']) && !empty($_POST['text']) && !empty($_POST['word'])) {
        $text = $_POST['text'];
        $word = $_POST['word'];

        $sentences = preg_split("/(?<=[.?!])\s*/", $_POST['text'], -1, PREG_SPLIT_NO_EMPTY);
        $sentences = array_map('trim', $sentences);
        $word = $_POST['word'];
        foreach ($sentences as $sentence) {
            if (preg_match("/\s+$word\s+.*[.?!]+$/", $sentence)) {
                echo "<p>$sentence</p>";
            }
        }
    }
    ?>
</div>

</body>
</html>