package com.hleme.apivideos.service;

import com.hleme.apivideos.DTO.request.VideoRequest;
import com.hleme.apivideos.DTO.response.VideoResponse;
import com.hleme.apivideos.mapper.VideoMapper;
import com.hleme.apivideos.model.Video;
import com.hleme.apivideos.repository.VideoRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
@AllArgsConstructor
public class VideoServiceImp implements VideoService {

    private final VideoMapper videoMapper;
    private final VideoRepository videoRepository;

    @Override
    public Page<VideoResponse> findAll(Pageable pageable) {
        return videoRepository.findAll(pageable)
                .map(videoMapper::toVideoResponse);
    }

    @Override
    public VideoResponse findById(long id) {
        return videoMapper.toVideoResponse(findVideoById(id));

    }

    @Override
    public VideoResponse create(VideoRequest videoRequest) {
        Video videoToBeSaved = videoMapper.fromVideoRequest(videoRequest);

        videoToBeSaved.setCreatedAt(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));

        return videoMapper.toVideoResponse(videoRepository.save(videoToBeSaved));
    }

    private Video findVideoById(long id) {
        return videoRepository.findById(id).orElseThrow();
    }


}
