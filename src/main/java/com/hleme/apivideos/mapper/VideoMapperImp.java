package com.hleme.apivideos.mapper;

import com.hleme.apivideos.DTO.response.VideoResponse;
import com.hleme.apivideos.model.Video;
import lombok.RequiredArgsConstructor;
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
}
