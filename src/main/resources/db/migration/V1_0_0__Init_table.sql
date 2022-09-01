CREATE TABLE IF NOT EXISTS lessons
(
    id             SERIAL,
    course_unit_id INTEGER     NOT NULL,
    lesson_name    VARCHAR(50) NOT NULL,
    CONSTRAINT pk_lessons_id PRIMARY KEY (id)
);

INSERT INTO lessons (id, course_unit_id, lesson_name)
VALUES (1, 1, 'Первая программа на Java'),
       (2, 1, 'Примитивные типы'),
       (3, 1, 'Целочисленные'),
       (4, 1, 'Числа с плавающей точкой'),
       (5, 1, 'Тип char'),
       (6, 1, 'Логический тип'),
       (7, 1, 'Переменные'),
       (8, 1, 'Арифметические операции'),
       (9, 1, 'Строки'),
       (10, 1, 'Условные операторы'),
       (11, 1, 'Циклы'),
       (12, 1, 'Массивы'),
       (13, 1, 'Функции');
