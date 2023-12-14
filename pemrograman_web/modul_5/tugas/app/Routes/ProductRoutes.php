<?php

namespace app\Routes;

include "app/Controllers/ProductController.php";

use App\Controllers\ProductController;

class ProductRoutes{
    public function handle($method, $path){

        if($method === "GET" && $path === "/api/product"){
            $controller = new ProductController();
            echo $controller->index();
        }

        if ($method === "POST" && $path === "/api/product") {
            $controller = new ProductController();
            echo $controller->insert();
        }

        if($method === 'PUT' && strpos($path, '/api/product') === 0){

            $pathParts = explode('/', $path);
            $id =  $pathParts[count($pathParts) - 1];


            $controller = new ProductController();
            echo $controller -> update($id);
        }

    }
}