package com.dasiu.springpresentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public_transport_stops")
public class PublicTransportStopController {

	private final PublicTransportStopRepository publicTransportStopRepository;

	@Autowired
	public PublicTransportStopController(PublicTransportStopRepository publicTransportStopRepository) {
		this.publicTransportStopRepository = publicTransportStopRepository;
	}

	@GetMapping("")
	public Iterable<PublicTransportStop> getPage() {
		return publicTransportStopRepository.findAll();
	}

	//	@RequestMapping("/greeting")
//	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//		return new Greeting(counter.incrementAndGet(),
//				String.format(template, name));
//	}

}
