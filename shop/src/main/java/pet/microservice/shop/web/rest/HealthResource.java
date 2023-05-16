package pet.microservice.shop.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pet.microservice.shop.domain.Health;
import pet.microservice.shop.domain.HealthStatus;

@RestController
@RequestMapping("api/v1")
public class HealthResource {
    private final Logger log = LoggerFactory.getLogger(HealthResource.class);

    @GetMapping(
            value = "/health",
            produces = "application/json"
    )
    public ResponseEntity<Health> getHealth(){
        log.debug("REST request to get status");
        final var health = new Health();
        health.setStatus(HealthStatus.UP);
        return ResponseEntity.ok().body(health);
    }

}
