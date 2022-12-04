package com.hleme.apivideos.service;

import com.hleme.apivideos.DTO.response.VideoResponse;
import com.hleme.apivideos.mapper.VideoMapper;
import com.hleme.apivideos.repository.VideoRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

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
    private Video findVideoById(long id) {
        return videoRepository.findById(id).orElseThrow();
    }
}
