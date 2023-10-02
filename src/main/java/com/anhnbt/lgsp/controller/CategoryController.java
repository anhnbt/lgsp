package com.anhnbt.lgsp.controller;

import com.anhnbt.lgsp.model.LoaiDanhMucType;
import com.anhnbt.lgsp.response.JsonResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/KNTC")
public class CategoryController {

    @Operation(summary = "Hàm lấy danh mục",
            security = { @SecurityRequirement(name = "bearer-key") },
            responses = {
            @ApiResponse(description = "Successful Operation", responseCode = "200"),
            @ApiResponse(responseCode = "404", description = "Not found"),
            @ApiResponse(responseCode = "401", description = "Authentication Failure")})
    @PostMapping("/TraDanhMuc")
    public ResponseEntity<?> traDanhMuc(@RequestBody LoaiDanhMucType request) {
        return ResponseEntity.ok(new JsonResponse("success"));
    }
}
