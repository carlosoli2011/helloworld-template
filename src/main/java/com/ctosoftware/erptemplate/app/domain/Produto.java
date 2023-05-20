package com.ctosoftware.erptemplate.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@NoArgsConstructor
public class Produto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;
}


