package dev.kbe.warenkorbbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingcartService {
    @Autowired
    private ShoppingcartRepository shoppingcartRepository;
}
