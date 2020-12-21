package test;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.metrics.annotation.SimplyTimed;

@Path("/hello")
@Stateless
@SimplyTimed(absolute = true)
public class TestService {

	@GET
	public String sayHello() {
		return "hello from REST service";
	}

}
