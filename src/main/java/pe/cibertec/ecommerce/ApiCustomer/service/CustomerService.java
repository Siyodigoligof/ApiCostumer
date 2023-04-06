
package pe.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;


public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(Long id);
    
}
