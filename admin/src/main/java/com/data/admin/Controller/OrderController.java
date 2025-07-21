package com.data.admin.Controller;

import com.data.admin.DTO.Request.OrderRequest;
import com.data.admin.DTO.Response.CustomResponse;
import com.data.admin.Entity.ProductOrder;
import com.data.admin.Serivce.OrderService;
import jakarta.servlet.http.HttpServletRequest;
import org.json.JSONObject;
//import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create-order")
    public ResponseEntity<?> createOrder(@RequestBody OrderRequest orderRequest) { // , HttpServletRequest request
        try {
//            String token = request.getHeader("Authorization");
//            if (token != null && token.startsWith("Bearer ")){
//                token = token.substring(7);
//            }
//            String[] parts = token.split("\\.");
//            String payload = new String(Base64.getDecoder().decode(parts[1]));
//            JSONObject jsonPayload = new JSONObject(payload);
//            Long userId = jsonPayload.getLong("id");

            ProductOrder productOrder = orderService.createOrder(orderRequest);
            return CustomResponse.ok(productOrder);
        } catch (Exception e) {
            return CustomResponse.conflict("Something went wrong");
        }
    }

    @GetMapping("/history")
    public ResponseEntity<?> getAllOrderHistoryByUserId(@RequestParam("userId") Long userId) {// HttpServletRequest request
        try {
//            String token = request.getHeader("Authorization");
//            if (token != null && token.startsWith("Bearer ")){
//                token = token.substring(7);
//            }
//
//            String[] parts = token.split("\\.");
//            String payload = new String(Base64.getDecoder().decode(parts[1]));
//
//            JSONObject jsonPayload = new JSONObject(payload);
//            Long userId = jsonPayload.getLong("id");

//            String token = request.getHeader("Authorization");
//            if (token == null || !token.startsWith("Bearer ")) {
//                return CustomResponse.unauthorized("Missing or invalid authorization token");
//            }
//            token = token.substring(7);
//            // Parse with JJWT
//            Claims claims = Jwts.parserBuilder()
//                    .build()
//                    .parseClaimsJws(token)
//                    .getBody();
//            Long userId = claims.get("id", Long.class);

            List<ProductOrder> productOrder = orderService.getAllOrderHistory(userId);
            return CustomResponse.ok(productOrder);
        } catch (Exception e) {
            return CustomResponse.conflict("Something went wrong");
        }
    }

    @GetMapping("/history/{order_id}")
    public ResponseEntity<?> getOrderHistoryById(@PathVariable("order_id") Long orderId) {
        try {
            ProductOrder productOrder = orderService.getOrderHistoryById(orderId);
            return CustomResponse.ok(productOrder);
        } catch (Exception e) {
            return CustomResponse.conflict("Something went wrong");
        }
    }

    @GetMapping("/all-user-history")
    public ResponseEntity<?> getAllOrderHistoryForAdmin() {
        try {
            List<ProductOrder> productOrder = orderService.getAllOrderHistoryForAdmin();
            return CustomResponse.ok(productOrder);
        } catch (Exception e) {
            return CustomResponse.conflict("Something went wrong");
        }
    }

    @PutMapping("update-order")
    public ResponseEntity<?> updateOrderStatusByAdmin(@RequestParam Long orderId, @RequestParam String orderStatus){
        try {
            orderService.updateOrderStatus(orderId, orderStatus);
            return CustomResponse.ok("Order Status updated successfully");
        }catch (Exception e) {
            return CustomResponse.conflict("Something went wrong");
        }
    }
    // product upload
    // product edit and delete
    // get user details
    // get order history for every user via user-service
    //
}
