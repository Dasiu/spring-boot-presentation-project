package com.dasiu.springpresentation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@RepositoryRestResource(path = "public_transport_stops")
public interface PublicTransportStopRepository extends PagingAndSortingRepository<PublicTransportStop, Long> {

}
