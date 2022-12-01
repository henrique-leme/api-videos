package com.hleme.apivideos.controller;

import com.hleme.apivideos.DTO.response.VideoResponse;
import com.hleme.apivideos.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/videos")
public class VideoController {

    private final VideoService videoService;
    
    @GetMapping
    public ResponseEntity<Page<VideoResponse>> findAll(String title,@PageableDefault(size = 10) Pageable pageable) {
            Page<VideoResponse> pageVideoResponse;
            pageVideoResponse = videoService.findAll(pageable);
        return ResponseEntity.ok(pageVideoResponse);
    }
}
