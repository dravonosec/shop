package pet.microservice.shop.domain;

import lombok.*;
import pet.microservice.shop.web.rest.HealthResource;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@ToString
public class Health {
    private HealthResource status;

    public void setStatus(HealthStatus up) {
    }
}
