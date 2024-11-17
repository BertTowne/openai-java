package com.theokanning.openai.moderation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * An object containing the flags for each moderation category
 *
 * https://beta.openai.com/docs/api-reference/moderations/create
 */
@Data
public class ModerationCategories {

    public boolean sexual;

    @JsonProperty("sexual/minors")
    public boolean sexualMinors;

    public boolean harassment;

    @JsonProperty("harassment/threatening")
    public boolean harassmentThreatening;

    public boolean hate;

    @JsonProperty("hate/threatening")
    public boolean hateThreatening;

    public boolean illicit;

    @JsonProperty("illicit/violent")
    public boolean illicitViolent;

    @JsonProperty("self-harm")
    public boolean selfHarm;

    @JsonProperty("self-harm/intent")
    public boolean selfHarmIntent;

    @JsonProperty("self-harm/instructions")
    public boolean selfHarmInstructions;

    public boolean violence;

    @JsonProperty("violence/graphic")
    public boolean violenceGraphic;

}