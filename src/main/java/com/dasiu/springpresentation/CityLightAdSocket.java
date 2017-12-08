package com.dasiu.springpresentation;

import javax.persistence.*;
import java.lang.invoke.MethodHandles;

@Entity
@DiscriminatorValue("CityLightAdSocket")
public class CityLightAdSocket extends AdSocket {

	@ManyToOne
	private PublicTransportStop publicTransportStop;

	public PublicTransportStop getPublicTransportStop() {
		return publicTransportStop;
	}

	public void setPublicTransportStop(PublicTransportStop publicTransportStop) {
		this.publicTransportStop = publicTransportStop;
	}

}
