package com.hleme.apivideos.mapper;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VideoMapperImp implements  VideoMapper{
    private final ModelMapper mapper;
}
