/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorainelab.bitbucket;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author dcnorris
 */
/**
 * A class extending {@link javax.ws.rs.core.Application} is the portable
 * way to define JAX-RS 2.0 resources, and the
 * {@link javax.ws.rs.ApplicationPath} defines the root path shared by all
 * these resources.
 *
 * @author Eduardo Martins
 */
@ApplicationPath("hookManager")
public class BitbucketHookManagerApplication extends Application {
}
