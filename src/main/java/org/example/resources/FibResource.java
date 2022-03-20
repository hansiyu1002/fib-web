package org.example.resources;

import org.example.api.Request;
import org.example.api.Result;
import org.example.core.FibCal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;



@Path("/fibonacci")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FibResource {
    private FibCal fibCal;

    public FibResource(FibCal fibCal) {
        this.fibCal = fibCal;
    }

    @POST
    public Result getFib(@NotNull @Valid Request request) {
        return new Result(fibCal.fib(request.getElements()), fibCal.fibSorted(request.getElements()));
    }
}
