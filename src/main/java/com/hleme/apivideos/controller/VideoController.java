package com.hleme.apivideos.controller;

import com.hleme.apivideos.DTO.request.VideoRequest;
import com.hleme.apivideos.DTO.request.groups.CreateInfo;
import com.hleme.apivideos.DTO.request.groups.UpdateInfo;
import com.hleme.apivideos.DTO.response.VideoResponse;
import com.hleme.apivideos.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


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

    @GetMapping("/{id}")
    public ResponseEntity<VideoResponse> findById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(videoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<VideoResponse> create(
            @RequestBody @Validated(CreateInfo.class) VideoRequest videoRequest, UriComponentsBuilder uriBuilder) {

        VideoResponse videoResponse = videoService.create(videoRequest);
        URI uri = uriBuilder.path("/videos/{id}").build(videoResponse.getId());
        return ResponseEntity.created(uri).body(videoResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VideoResponse> update(
            @PathVariable(name = "id") long id,
            @RequestBody @Validated({CreateInfo.class, UpdateInfo.class}) VideoRequest videoRequest) {
        return ResponseEntity.ok(videoService.update(id, videoRequest));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable(name = "id") long id) {
        videoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
