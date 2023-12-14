<?php

namespace app\Controllers;

require_once "app/Helpers/ApiRes.php";
include "app/Models/Transaction.php";

use App\Models\Transaction;
use App\Helpers\ApiRes;


class TransactionController {
    use ApiRes;

    public function insert(){
        $jsonInput = file_get_contents('php://input');
        $inputData = json_decode($jsonInput, true);
    
        if (json_last_error()) {
            return $this->apiResponse(400, "error invalid input", null);
        }
    
        $transactionModel = new Transaction();
    
        $response = $transactionModel->addData(
            $inputData["total_price"],
            $inputData["paid_amount"],
            $inputData["products"],
            $inputData["no_order"],
        );

        return $this->apiResponse(200, "success", $response);
    }
    
}