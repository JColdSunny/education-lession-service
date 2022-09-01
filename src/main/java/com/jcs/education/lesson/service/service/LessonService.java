package com.jcs.education.lesson.service.service;

import com.jcs.education.common.proto.Lesson;
import com.jcs.education.lesson.service.mapper.LessonMapper;
import com.jcs.education.lesson.service.proto.v1.GetLessonsRequest;
import com.jcs.education.lesson.service.proto.v1.GetLessonsResponse;
import com.jcs.education.lesson.service.repository.LessonRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class LessonService {
    LessonRepository lessonRepository;
    LessonMapper lessonMapper;

    public GetLessonsResponse getCourseUnitLessons(GetLessonsRequest request) {
        LessonServiceValidator.validateGetLessonsRequest(request);

        List<Lesson> lessons = lessonRepository.findAllByCourseUnitId(request.getCourseUnitId()).stream()
                .map(lessonMapper::toGrpcLesson)
                .toList();

        return GetLessonsResponse.newBuilder()
                .addAllLessons(lessons)
                .build();
    }
}
