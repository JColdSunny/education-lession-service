package com.jcs.education.lesson.service.mapper;

import com.jcs.education.common.proto.Lesson;
import com.jcs.education.lesson.service.entity.LessonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface LessonMapper {

    @Mapping(target = "lessonId", source = "id")
    Lesson toGrpcLesson(LessonEntity lessonEntity);

}
