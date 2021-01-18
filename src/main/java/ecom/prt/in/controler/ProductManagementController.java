package ecom.prt.in.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ecom")
public class ProductManagementController {
	
	
	
	
	@GetMapping("/healthCheck")
	public String getHealthCheck() {
		Logger log = LoggerFactory.getLogger(ProductManagementController.class);
		log.info("request for all products {}");
		return "working fine";
		
	}	
	
	
}
