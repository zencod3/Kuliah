<?php

header("Content-Type: application/json; charset=UTF-8");


include "app/Routes/ProductRoutes.php";
include "app/Routes/TransactionRoutes.php";

use App\Routes\ProductRoutes;
use App\Routes\TransactionRoutes;

$method = $_SERVER["REQUEST_METHOD"];
$path = parse_url($_SERVER["REQUEST_URI"], PHP_URL_PATH);


$productRoute = new ProductRoutes();
$productRoute->handle($method, $path);

$transactionRoute = new TransactionRoutes();
$transactionRoute->handle($method, $path);