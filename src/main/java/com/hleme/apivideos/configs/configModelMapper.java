package com.hleme.apivideos.configs;

import com.hleme.apivideos.DTO.request.VideoRequest;
import com.hleme.apivideos.model.Video;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configModelMapper {
    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper mapper = new ModelMapper();
        PropertyMap<VideoRequest, Video> videoMap = new PropertyMap<VideoRequest, Video>() {
            protected void configure() {
                map().setId(null);
            }
        };
        mapper.addMappings(videoMap);

        mapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());

        return mapper;
    }
}
