package com.lorainelab.bitbucket;

import java.util.Collections;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author dcnorris
 */
@Path("/")
public class HookListener {

    private static final Logger logger = LoggerFactory.getLogger(HookListener.class);

    @Path("/")
    @POST
    @GET
    @Consumes(MediaType.WILDCARD)
    @Produces(MediaType.WILDCARD)
    public Response doSomething(@Context HttpServletRequest request, byte[] input) {
        logger.info("Content-Type: {}", request.getContentType());
        Collections.list(request.getAttributeNames()).forEach(logger::info);

        return Response.ok().build();
    }
}
