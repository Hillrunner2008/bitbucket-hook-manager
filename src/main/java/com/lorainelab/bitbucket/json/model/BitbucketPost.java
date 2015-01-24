package com.lorainelab.bitbucket.json.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "repository",
    "truncated",
    "commits",
    "canon_url",
    "user"
})
public class BitbucketPost {

    @JsonProperty("repository")
    private Repository repository;
    @JsonProperty("truncated")
    private boolean truncated;
    @JsonProperty("commits")
    private List<Commit> commits = new ArrayList<Commit>();
    @JsonProperty("canon_url")
    private String canonUrl;
    @JsonProperty("user")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The repository
     */
    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    /**
     * 
     * @param repository
     *     The repository
     */
    @JsonProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     * 
     * @return
     *     The truncated
     */
    @JsonProperty("truncated")
    public boolean isTruncated() {
        return truncated;
    }

    /**
     * 
     * @param truncated
     *     The truncated
     */
    @JsonProperty("truncated")
    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * 
     * @return
     *     The commits
     */
    @JsonProperty("commits")
    public List<Commit> getCommits() {
        return commits;
    }

    /**
     * 
     * @param commits
     *     The commits
     */
    @JsonProperty("commits")
    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    /**
     * 
     * @return
     *     The canonUrl
     */
    @JsonProperty("canon_url")
    public String getCanonUrl() {
        return canonUrl;
    }

    /**
     * 
     * @param canonUrl
     *     The canon_url
     */
    @JsonProperty("canon_url")
    public void setCanonUrl(String canonUrl) {
        this.canonUrl = canonUrl;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
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
        return new HashCodeBuilder().append(repository).append(truncated).append(commits).append(canonUrl).append(user).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BitbucketPost) == false) {
            return false;
        }
        BitbucketPost rhs = ((BitbucketPost) other);
        return new EqualsBuilder().append(repository, rhs.repository).append(truncated, rhs.truncated).append(commits, rhs.commits).append(canonUrl, rhs.canonUrl).append(user, rhs.user).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
