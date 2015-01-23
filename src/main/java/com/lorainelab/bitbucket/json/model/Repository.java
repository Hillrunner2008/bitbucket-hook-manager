
package com.lorainelab.bitbucket.json.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "absolute_url",
    "fork",
    "is_private",
    "name",
    "owner",
    "scm",
    "slug",
    "website"
})
public class Repository {

    @JsonProperty("absolute_url")
    private String absoluteUrl;
    @JsonProperty("fork")
    private boolean fork;
    @JsonProperty("is_private")
    private boolean isPrivate;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("scm")
    private String scm;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("website")
    private String website;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The absoluteUrl
     */
    @JsonProperty("absolute_url")
    public String getAbsoluteUrl() {
        return absoluteUrl;
    }

    /**
     * 
     * @param absoluteUrl
     *     The absolute_url
     */
    @JsonProperty("absolute_url")
    public void setAbsoluteUrl(String absoluteUrl) {
        this.absoluteUrl = absoluteUrl;
    }

    /**
     * 
     * @return
     *     The fork
     */
    @JsonProperty("fork")
    public boolean isFork() {
        return fork;
    }

    /**
     * 
     * @param fork
     *     The fork
     */
    @JsonProperty("fork")
    public void setFork(boolean fork) {
        this.fork = fork;
    }

    /**
     * 
     * @return
     *     The isPrivate
     */
    @JsonProperty("is_private")
    public boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * 
     * @param isPrivate
     *     The is_private
     */
    @JsonProperty("is_private")
    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The owner
     */
    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 
     * @return
     *     The scm
     */
    @JsonProperty("scm")
    public String getScm() {
        return scm;
    }

    /**
     * 
     * @param scm
     *     The scm
     */
    @JsonProperty("scm")
    public void setScm(String scm) {
        this.scm = scm;
    }

    /**
     * 
     * @return
     *     The slug
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     * 
     * @param website
     *     The website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
