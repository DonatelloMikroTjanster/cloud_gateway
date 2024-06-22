package se.salts.cloud_gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/fallback/booking")
    public ResponseEntity<String> bookingFallback() {
        return ResponseEntity.ok("Booking Service is currently unavailable. Please try again later.");
    }
    @GetMapping("/fallback/customer")
    public ResponseEntity<String> customerFallback() {
        return ResponseEntity.ok("Customer Service is currently unavailable. Please try again later.");
    }
    @GetMapping("/fallback/trip")
    public ResponseEntity<String> tripFallback() {
        return ResponseEntity.ok("Trip Service is currently unavailable. Please try again later.");
    }
}
