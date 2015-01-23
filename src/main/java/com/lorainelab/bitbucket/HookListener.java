package com.lorainelab.bitbucket;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.CharStreams;
import com.lorainelab.bitbucket.json.model.BitbucketPost;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    private ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally

    @Path("/")
    @POST
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.WILDCARD)
    public Response doSomething(@Context HttpServletRequest request, InputStream requestBody) {
        try {
            String rawPostBodyContent = CharStreams.toString(new InputStreamReader(requestBody, "UTF-8"));

            BitbucketPost post = mapper.readValue(rawPostBodyContent, BitbucketPost.class);
            logger.info(post.getCommits().get(0).getBranch());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Response.ok().build();
    }

}
