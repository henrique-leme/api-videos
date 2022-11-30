package com.hleme.apivideos.repository;

import com.hleme.apivideos.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
