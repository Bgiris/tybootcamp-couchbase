package com.tybootcamp.couchbase.service;

import com.tybootcamp.couchbase.domain.Product;
import com.tybootcamp.couchbase.domain.Seller;
import com.tybootcamp.couchbase.repository.SellerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

  private final SellerRepository sellerRepository;

  public SellerService(SellerRepository sellerRepository) {
    this.sellerRepository = sellerRepository;
  }

  public Seller create(String name) {
    Seller seller = new Seller(name);
    return sellerRepository.save(seller);
  }

  public Seller findById(String id) {
    return sellerRepository.findById(id).orElseThrow(() -> new RuntimeException(
        String.format("Seller not found with id: %s", id))
    );
  }

  public Seller findByName(String name) {
    //TODO: Not yet implemented
    throw new RuntimeException("Implement me");
  }

  public void addProductsToSeller(String sellerName, List<Product> products) {
    //TODO: Not yet implemented
    throw new RuntimeException("Implement me");
  }

  public List<Product> getProductsByCategory(String sellerName, String category) {
    //TODO: Not yet implemented
    throw new RuntimeException("Implement me");
  }
}
