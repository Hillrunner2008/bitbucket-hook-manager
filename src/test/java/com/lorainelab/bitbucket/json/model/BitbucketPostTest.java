/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorainelab.bitbucket.json.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author dcnorris
 */
public class BitbucketPostTest {

    @Test
    public void urlEncoded() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String urlEncodedPost = Resources.toString(BitbucketPost.class.getClassLoader().getResource("samplePostUrlEncoded.txt"), Charsets.UTF_8);
        urlEncodedPost = java.net.URLDecoder.decode(urlEncodedPost.substring(8), "UTF-8");
        BitbucketPost post = objectMapper.readValue(urlEncodedPost, BitbucketPost.class);
        Assert.assertNotNull(post);
        Assert.assertEquals("master", post.getCommits().get(0).getBranch());
    }

}
