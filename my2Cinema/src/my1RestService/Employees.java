package my1RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("employees")
public class Employees {
	
	@GET
	public String getEmployeeNames(@QueryParam("sortBy") String sortedBy) {
		return "Americo, Tomas, Ana, Batalha, xxx " + "sorted by " + sortedBy;
	}
	
	@GET
	@Path("id/{identifier: [0-9]*}") //reg expression for only numbers
	public String getById(@PathParam("identifier") String myId) {
		return myId;
	}
}
