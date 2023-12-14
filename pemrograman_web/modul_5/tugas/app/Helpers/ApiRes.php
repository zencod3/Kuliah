<?php  

namespace app\Helpers;

trait ApiRes {
    public function apiResponse($code = 200, $message = "success", $data = []) {

        return json_encode([
            "code" => $code,
            "message" => $message,
            "data" => $data
        ]);
    }
}
