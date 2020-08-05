package com.supermarket.BillingApplication;




import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product, Long> {
	

}