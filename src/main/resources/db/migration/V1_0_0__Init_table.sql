CREATE TABLE IF NOT EXISTS lessons
(
    id             SERIAL,
    lesson_name    VARCHAR(50) NOT NULL,
    CONSTRAINT pk_lessons_id PRIMARY KEY (id)
);

INSERT INTO lessons (id, lesson_name)
VALUES (1, 'Первая программа на Java'),
       (2, 'Примитивные типы'),
       (3, 'Целочисленные'),
       (4, 'Числа с плавающей точкой'),
       (5, 'Тип char'),
       (6, 'Логический тип'),
       (7, 'Переменные'),
       (8, 'Арифметические операции'),
       (9, 'Строки'),
       (10, 'Условные операторы'),
       (11, 'Циклы'),
       (12, 'Массивы'),
       (13, 'Функции');
