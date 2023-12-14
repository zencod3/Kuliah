<?php
function generateRandomOrderNumber() {
    $orderNumber = 'J' . mt_rand(1, 1000);
    return $orderNumber;
}

