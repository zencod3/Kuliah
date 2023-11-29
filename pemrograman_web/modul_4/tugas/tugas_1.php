<?php

function generator($n)
{
    for ($i = 1; $i <= $n; $i++) {
        // Jika i habis dibagi 3 dan 5
        if ($i % 3 == 0 && $i % 5 == 0) {
            echo "HelloWorld";
        }
        // misalkan i habis dibagi 3 (tapi nggak habis dibagi 5)
        elseif ($i % 3 == 0) {
            echo "Hello";
        }
        // misalkan i habis dibagi 5 (tapi nggak habis dibagi 3)
        elseif ($i % 5 == 0) {
            echo "World";
        }
        // kalau tidak memenuhi kondisi di atas
        else {
            echo $i;
        }

        echo PHP_EOL;
    }
}

generator(15);
