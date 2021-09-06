package com.company.jaxrs.service;

import com.company.jaxrs.dao.SportDaoImpl;
import com.company.jaxrs.model.Sport;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//sS @ w
@Path("/sport")
public class SportService {
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveSport(Sport sport){
        SportDaoImpl sportDao = new SportDaoImpl();
        sportDao.saveSport(sport);
        return Response.accepted().entity("Успешно добавили!").build();
    }
}
