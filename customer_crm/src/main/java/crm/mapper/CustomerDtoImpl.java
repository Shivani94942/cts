package crm.mapper;

import org.mapstruct.Mapper;

import crm.model.Customer;

@Mapper
public interface CustomerDtoImpl {
	
	public Customer customerDtoToCustomer(Customer customer);

}
