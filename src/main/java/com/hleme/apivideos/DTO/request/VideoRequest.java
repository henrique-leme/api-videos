package com.hleme.apivideos.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class VideoRequest {

    private String title;

    private String description;

    private String url;
}
