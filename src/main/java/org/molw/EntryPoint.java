package org.molw;

import org.molw.model.BirdAnalysis;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/birds")
public class EntryPoint {

    @Inject
    BirdAnalysis ba;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello()
    {
        return "hello birdy " + ba.getNumberOfObservations();
    }
}