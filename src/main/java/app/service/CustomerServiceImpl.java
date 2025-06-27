package app.service;

import app.domain.Customer;
import app.repositories.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }


    @Override                    //TODO
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> getAllActiveCustomer() {
        return  repository.findAll().stream()
                .filter(x -> x.isActive())
                .collect(Collectors.toList());
    }

    @Override
    public Customer getByID(Long id) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public void restoreById(long id) {

    }

    @Override
    public long getActiveCustomer() {
        return 0;
    }

    @Override
    public long getBasketValueForActiveCustomer() {
        return 0;
    }

    @Override
    public double getAverageProductPriceForActiveCustomer() {
        return 0;
    }

    @Override
    public void addProductToCustomerBasket(Long customerId, Long productId) {

    }

    @Override
    public void removeProductByIdFromBasket(Long customerId, Long productId) {

    }

    @Override
    public void removeAllFromBasketById(Long customerId) {

    }
}
