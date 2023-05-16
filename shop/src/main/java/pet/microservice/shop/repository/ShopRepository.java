package pet.microservice.shop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pet.microservice.shop.domain.Order;

@Repository
public interface ShopRepository extends MongoRepository<Order, String> {

}
