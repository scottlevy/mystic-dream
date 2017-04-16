package dream.mystic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dream.mystic.domain.Customer;
import dream.mystic.repository.CustomerRepository;
import dream.mystic.repository.TripDetailRepository;
import dream.mystic.repository.TripRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private final CustomerRepository customerRepository;
	private final TripRepository tripRepository;
	private final TripDetailRepository tripDetailRepository;
	
	@Autowired
	CustomerController(CustomerRepository customerRepository,
						   TripRepository tripRepository,
						   TripDetailRepository tripDetailRepository) {
		this.customerRepository = customerRepository;
		this.tripRepository = tripRepository;
		this.tripDetailRepository = tripDetailRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/all")
	//Trip readTrip(@PathVariable String userId, @PathVariable Long tripId) {
	List<Customer> readTrips() {
	//	this.validateUser(userId);
		return this.customerRepository.findAll();
	}
}
