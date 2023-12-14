<?php

namespace app\Models;

require_once "app/Config/DB.php";
require_once "app/Helpers/Utils.php";

use app\Config\DB;
use app\Helpers\Utils;
use mysqli;

class Transaction extends DB{
    use \app\Helpers\ApiRes;
    public $conn;

    public function __construct(){

                $this->conn = new mysqli($this->host, $this->user, $this->password, $this->database_name, $this->port);

                if ($this->conn->connect_error) {
                    die("Connection failed: " . $this->conn->connect_error);
                }
    }


    

    public function addData($total_price, $paid_amount, $products) {

        $order_number = generateRandomOrderNumber();
    
        $query = "INSERT INTO transactions (no_order, total_price, paid_amount) VALUES (?, ?, ?)";
        $stmt = $this->conn->prepare($query);
    
        if (!$stmt) {
            return $this->apiResponse(500, "Error: " . $this->conn->error, null);
        }
    
        $stmt->bind_param("sii", $order_number, $total_price, $paid_amount);
        $stmt->execute();
    
        if ($stmt->error) {
            return $this->apiResponse(500, "Error: " . $stmt->error, null);
        }
    
        $stmt->close();
        
    
        foreach ($products as $item) {
            $query = "INSERT INTO transaction_detail (id_product,no_order , quantity) VALUES (?, ?, ?)";
            $stmt = $this->conn->prepare($query);
    
            if (!$stmt) {
                return $this->apiResponse(500, "Error: " . $this->conn->error, null);
            }
    
            $stmt->bind_param("ssi",$item["id"],$order_number,  $item["quantity"], );
            $stmt->execute();
    
            if ($stmt->error) {
                return $this->apiResponse(500, "Error: " . $stmt->error, null);
            }
    
            $stmt->close();
    
            $query = "UPDATE products SET stock = stock - ? WHERE id = ?";
            $stmt = $this->conn->prepare($query);
    
            if (!$stmt) {
                return $this->apiResponse(500, "Error: " . $this->conn->error, null);
            }
    
            $stmt->bind_param("ii", $item["quantity"], $item["id"]);
            $stmt->execute();
    
            if ($stmt->error) {
                return $this->apiResponse(500, "Error: " . $stmt->error, null);
            }
    
            $stmt->close();
        }
        return $order_number;
        return $this->apiResponse(200, "Data inserted successfully", null);
    }
    
    
}
