package com.hleme.apivideos.mapper;

import com.hleme.apivideos.DTO.request.VideoRequest;
import com.hleme.apivideos.DTO.response.VideoResponse;
import com.hleme.apivideos.model.Video;

public interface VideoMapper {

    VideoResponse toVideoResponse(Video video);

    Video fromVideoRequest(VideoRequest videoRequest);

    Video mergeVideo(VideoRequest source, Video destination);
}
