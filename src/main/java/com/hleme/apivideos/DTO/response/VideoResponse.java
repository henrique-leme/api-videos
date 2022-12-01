package com.hleme.apivideos.DTO.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VideoResponse {
    private Long id;
    private String title;
    private String description;
    private String url;
}
