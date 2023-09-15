package dev.kbe.warenkorbbackend;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ShoppingcartRepository extends MongoRepository<Shoppingcart, String> {
    // Optional<Shoppingcart> findByUserId(String userId);
    // TODO: not sure if it supposed to be like this
}
