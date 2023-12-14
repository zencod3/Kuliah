<?php

namespace app\Controllers;

require_once "app/Helpers/ApiRes.php";
include "app/Models/Product.php";

use App\Models\Product;
use App\Helpers\ApiRes;

class ProductController {
    use ApiRes;

    public function index(){
        $productModel = new Product;
        $res = $productModel->getData();
        return $this->apiResponse(200, "success", $res);
    }


    public function insert(){
                
        $jsonInput = file_get_contents('php://input');
        $inputData = json_decode($jsonInput, true);
            if (json_last_error()) {
            return $this->apiResponse(400, "error invalid input", null);
            }

    
        $productModel = new Product();
        $response = $productModel->addData(
            [
                "nama" => $inputData["nama"],
                "price" => $inputData["price"],
                "stock" => $inputData["stock"],
            ]
    );

    

        return $this->apiResponse(200, "success", $response);

    }

    public function update($id)
    {
        $jsonInput = file_get_contents('php://input');
        $inputData = json_decode($jsonInput, true);
        
        if(json_last_error()){
            return $this -> apiResponse(400, "error iunvalid input", null);

        }

        $productModel = new Product();
        $response = $productModel -> updateDate(
            [
                "stock" => $inputData['stock']
            ],$id);

            return $this -> apiResponse(200, "success", $response);
    }



}