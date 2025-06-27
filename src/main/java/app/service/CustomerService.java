package app.service;

import app.domain.Customer;


import java.util.List;

public interface CustomerService {

    Customer  save (Customer customer);

    List<Customer> getAllActiveCustomer();

    Customer getByID (Long id);

    void update (Customer customer);

    void deleteById (Long id);

    void deleteByName (String name);

    void restoreById (long id);

    long getActiveCustomer ();

    long getBasketValueForActiveCustomer();

    double getAverageProductPriceForActiveCustomer();

    void addProductToCustomerBasket (Long customerId, Long productId);

    void removeProductByIdFromBasket (Long customerId, Long productId);

    void removeAllFromBasketById (Long customerId);

}
