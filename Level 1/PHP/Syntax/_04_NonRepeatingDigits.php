<?php
$n = 145;
$arr = array();

for ($i = 102; $i <= $n; $i++) {
    if ($i > 999) {
        break;
    }

    $first = (int)($i % 10);
    $second = (int)(($i / 10) % 10);
    $third = (int)($i / 100);

    if($first !== $second && $first !== $third && $second !== $third) {
        array_push($arr, $i);
    }
}

if (count($arr) > 0) {
    echo implode (',', $arr);
} else {
    echo "no";
}
?>