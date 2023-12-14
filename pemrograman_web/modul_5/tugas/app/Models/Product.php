<?php

namespace app\Models;

require_once "app/Config/DB.php";

use app\Config\DB;
use mysqli;

class Product extends DB {
    public $conn;

    public function __construct(){
                // Connect ke database mysql
                $this->conn = new mysqli($this->host, $this->user, $this->password, $this->database_name, $this->port);
                // Check connection
                if ($this->conn->connect_error) {
                    die("Connection failed: " . $this->conn->connect_error);
                }
    }

    public function getData(){
        $query = "SELECT * FROM products";
        $result = $this->conn->query($query);
        $this->conn->close();
        $data = [];
        while ($row = $result->fetch_assoc()) {
            $data[] = $row;
        }

        return $data;
        
    }

    public function getDataById($id){
        $query = "SELECT * FROM products WHERE id ?";
        $stmt = $this -> conn -> prepare($query);
        $stmt -> execute();
        $result = $stmt -> get_result();
        $this -> conn -> close();
        $data = [];
        while($row = $result -> fetch_assoc()){
            $data[] = $row;
        }
        return $data;
    }


    public function addData($nama, $price, $stock){
        $pNama = $nama;
        $pPrice = $price;
        $pStock = $stock;
    
        $query = "INSERT INTO products (nama, price, stock) VALUES (?, ?, ?)";
        $stmt = $this->conn->prepare($query);
    
        if (!$stmt) {
            return $this->conn->error; 
        }
    
        $stmt->bind_param("sii", $pNama, $pPrice, $pStock);
        $stmt->execute();
    
        if ($stmt->error) {
            return $stmt->error; 
        }
    
        $stmt->close();
        return "Data inserted successfully";
    }


    public function updateDate($data, $id){
        $stock = $data['stock'];
        $query = "UPDATE products SET stock = ? WHERE id = ?";
        $stmt = $this -> conn -> prepare($query);
        $stmt -> bind_param("ii", $stock, $id);
        $stmt -> execute();
        $this -> conn -> close();
    }
    
}