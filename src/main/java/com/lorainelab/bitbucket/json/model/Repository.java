
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
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "website",
    "fork",
    "name",
    "scm",
    "owner",
    "absolute_url",
    "slug",
    "is_private"
})
public class Repository {

    @JsonProperty("website")
    private String website;
    @JsonProperty("fork")
    private boolean fork;
    @JsonProperty("name")
    private String name;
    @JsonProperty("scm")
    private String scm;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("absolute_url")
    private String absoluteUrl;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("is_private")
    private boolean isPrivate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(website).append(fork).append(name).append(scm).append(owner).append(absoluteUrl).append(slug).append(isPrivate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Repository) == false) {
            return false;
        }
        Repository rhs = ((Repository) other);
        return new EqualsBuilder().append(website, rhs.website).append(fork, rhs.fork).append(name, rhs.name).append(scm, rhs.scm).append(owner, rhs.owner).append(absoluteUrl, rhs.absoluteUrl).append(slug, rhs.slug).append(isPrivate, rhs.isPrivate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
