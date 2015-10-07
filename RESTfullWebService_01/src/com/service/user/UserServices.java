package com.service.user;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

//URI
@Path("/user/service")
public class UserServices {
	
	//CRUD: this class belong to the above URI (root resource class)
	/** CreateUser */
	@PUT 
	@Path("/create")
	public void createUser() {
		
	}
	
	/** GetUser */
	@GET
	public void getUser() {
		System.err.println("INSIDE GET_USER METHOD!!");
	}
	
	/** UpdateUser */
	@POST
	public void updateUser() {
		System.out.println("INSIDE UPDATE_USER METHOD!");
	}
	
	/** DeleteUser */
	@DELETE
	public void deleteUser() {
		
	}
	
	/** DeleteUser */
	@Path("/special")
	public SpecialUser getSpecialUser() {
		return new SpecialUser();
	}

}
