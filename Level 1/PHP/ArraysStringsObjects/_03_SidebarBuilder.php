<!DOCTYPE html>
<?php
function write ($arr, $header) {
    echo ("<div class=\"side\">" . "<span class=\"header\">$header</span>" . "<ul>");

    foreach ($arr as $val) {
        echo("<li>$val</li>");
    }

    echo "</ul></div>";
}
?>
<html>
<head>
    <title>Word Mapping</title>
    <style>
        li {
            text-decoration: underline;
            list-style: circle;
        }

        .header {
            display: block;
            border-bottom: 1px solid black;
            width: 100%;
            font-weight: bold;
        }

        .side {
            width: 150px;
            border: 1px solid black;
            border-radius: 15px;
            padding: 15px 0px 10px 10px;
            margin: 5px;
            background: linear-gradient(#C2D3EA, #82A3CE);
        }
    </style>
</head>
<body>
<form action="#" method="POST">
    <label for="categories">Categories: </label>
    <input type="text" id="categories" name="categories"/>
    <label for="tags">Tags: </label>
    <input type="text" id="tags" name="tags"/>
    <label for="months">Months: </label>
    <input type="text" id="months" name="months"/>
    <input type="submit" name="submit" value="Generate"/>
</form>
    <?php
    if (isset($_POST['submit']) && !empty($_POST['categories']) && !empty($_POST['tags']) && !empty($_POST['months'])) {
        $categories = explode(', ', $_POST['categories']);
        $tags = explode(', ', $_POST['tags']);
        $months = explode(', ', $_POST['months']);

        write($categories, "Categories");
        write($tags, "Tags");
        write($months, "Months");
    }
    ?>
</body>
</html>