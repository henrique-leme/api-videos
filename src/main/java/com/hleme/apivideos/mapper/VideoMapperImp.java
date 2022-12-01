package com.hleme.apivideos.mapper;

import com.hleme.apivideos.DTO.request.VideoRequest;
import com.hleme.apivideos.DTO.response.VideoResponse;
import com.hleme.apivideos.model.Video;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VideoMapperImp implements  VideoMapper{
    private final ModelMapper mapper;

    @Override
    public VideoResponse toVideoResponse(Video video) {
        return mapper.map(video, VideoResponse.class);
    }

    @Override
    public Video fromVideoRequest(VideoRequest videoRequest) {
        return mapper.map(videoRequest, Video.class);
    }

    @Override
    public Video mergeVideo(VideoRequest source, Video destination) {
        mapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        mapper.map(fromVideoRequest(source), destination);
        return destination;
    }
}
