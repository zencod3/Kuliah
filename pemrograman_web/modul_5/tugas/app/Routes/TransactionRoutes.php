<?php

namespace app\Routes;

include "app/Controllers/TransactionController.php";

use App\Controllers\TransactionController;

class TransactionRoutes{
    public function handle($method, $path){


        if ($method === "POST" && $path === "/api/transaction") {
            $controller = new TransactionController();
            echo $controller->insert();
        }

    }
}