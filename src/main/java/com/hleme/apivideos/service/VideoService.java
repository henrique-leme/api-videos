package com.hleme.apivideos.service;

import com.hleme.apivideos.DTO.response.VideoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VideoService {

    Page<VideoResponse> findAll(Pageable pageable);

    VideoResponse findById(long id);

}
