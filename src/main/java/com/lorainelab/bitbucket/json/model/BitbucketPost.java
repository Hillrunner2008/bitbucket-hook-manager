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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "canon_url",
    "commits",
    "repository",
    "user"
})
public class BitbucketPost {

    @JsonProperty("canon_url")
    private String canonUrl;
    @JsonProperty("commits")
    private List<Commit> commits = new ArrayList<Commit>();
    @JsonProperty("repository")
    private Repository repository;
    @JsonProperty("user")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The canonUrl
     */
    @JsonProperty("canon_url")
    public String getCanonUrl() {
        return canonUrl;
    }

    /**
     *
     * @param canonUrl
     * The canon_url
     */
    @JsonProperty("canon_url")
    public void setCanonUrl(String canonUrl) {
        this.canonUrl = canonUrl;
    }

    /**
     *
     * @return
     * The commits
     */
    @JsonProperty("commits")
    public List<Commit> getCommits() {
        return commits;
    }

    /**
     *
     * @param commits
     * The commits
     */
    @JsonProperty("commits")
    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    /**
     *
     * @return
     * The repository
     */
    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    /**
     *
     * @param repository
     * The repository
     */
    @JsonProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     *
     * @return
     * The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
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
