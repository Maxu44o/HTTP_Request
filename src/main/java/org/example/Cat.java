package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cat {

    private final String id;
    private final String user;
    private final String text;
    private final int version;
    private final boolean used;

    public Cat(
            @JsonProperty("_id") String id,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text,
            @JsonProperty("__v") int version,
            @JsonProperty("used") boolean used) {

        this.user = user;
        this.text = text;
        this.id = id;
        this.version = version;
        this.used = used;
    }

    public int getVersion() {return version;
    }

    public boolean getUsed() {return used;
    }


    // ... все getters
    @Override
    public String toString() {
        return "CatFact" + "\n  id=" + id + "\n  user=" + user + "\n  text=" + text + "\n  version=" + version + "\n  used=" + used;
    }
}
