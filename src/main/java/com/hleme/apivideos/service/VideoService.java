package com.hleme.apivideos.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VideoService {

    Page<VideoResponse> findAll(Pageable pageable)

}
