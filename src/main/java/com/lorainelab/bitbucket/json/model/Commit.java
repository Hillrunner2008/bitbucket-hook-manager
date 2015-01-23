
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
    "author",
    "branch",
    "files",
    "message",
    "node",
    "parents",
    "raw_author",
    "raw_node",
    "revision",
    "size",
    "timestamp",
    "utctimestamp"
})
public class Commit {

    @JsonProperty("author")
    private String author;
    @JsonProperty("branch")
    private String branch;
    @JsonProperty("files")
    private List<File> files = new ArrayList<File>();
    @JsonProperty("message")
    private String message;
    @JsonProperty("node")
    private String node;
    @JsonProperty("parents")
    private List<String> parents = new ArrayList<String>();
    @JsonProperty("raw_author")
    private String rawAuthor;
    @JsonProperty("raw_node")
    private String rawNode;
    @JsonProperty("revision")
    private Object revision;
    @JsonProperty("size")
    private int size;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("utctimestamp")
    private String utctimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The author
     */
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The branch
     */
    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    /**
     * 
     * @param branch
     *     The branch
     */
    @JsonProperty("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * 
     * @return
     *     The files
     */
    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    /**
     * 
     * @param files
     *     The files
     */
    @JsonProperty("files")
    public void setFiles(List<File> files) {
        this.files = files;
    }

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The node
     */
    @JsonProperty("node")
    public String getNode() {
        return node;
    }

    /**
     * 
     * @param node
     *     The node
     */
    @JsonProperty("node")
    public void setNode(String node) {
        this.node = node;
    }

    /**
     * 
     * @return
     *     The parents
     */
    @JsonProperty("parents")
    public List<String> getParents() {
        return parents;
    }

    /**
     * 
     * @param parents
     *     The parents
     */
    @JsonProperty("parents")
    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    /**
     * 
     * @return
     *     The rawAuthor
     */
    @JsonProperty("raw_author")
    public String getRawAuthor() {
        return rawAuthor;
    }

    /**
     * 
     * @param rawAuthor
     *     The raw_author
     */
    @JsonProperty("raw_author")
    public void setRawAuthor(String rawAuthor) {
        this.rawAuthor = rawAuthor;
    }

    /**
     * 
     * @return
     *     The rawNode
     */
    @JsonProperty("raw_node")
    public String getRawNode() {
        return rawNode;
    }

    /**
     * 
     * @param rawNode
     *     The raw_node
     */
    @JsonProperty("raw_node")
    public void setRawNode(String rawNode) {
        this.rawNode = rawNode;
    }

    /**
     * 
     * @return
     *     The revision
     */
    @JsonProperty("revision")
    public Object getRevision() {
        return revision;
    }

    /**
     * 
     * @param revision
     *     The revision
     */
    @JsonProperty("revision")
    public void setRevision(Object revision) {
        this.revision = revision;
    }

    /**
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The utctimestamp
     */
    @JsonProperty("utctimestamp")
    public String getUtctimestamp() {
        return utctimestamp;
    }

    /**
     * 
     * @param utctimestamp
     *     The utctimestamp
     */
    @JsonProperty("utctimestamp")
    public void setUtctimestamp(String utctimestamp) {
        this.utctimestamp = utctimestamp;
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
