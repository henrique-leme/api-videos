package com.hleme.apivideos.service;

import com.hleme.apivideos.mapper.VideoMapper;
import com.hleme.apivideos.repository.VideoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VideoServiceImp implements VideoService {

    private final VideoMapper videoMapper;
    private final VideoRepository videoRepository;


}
