CREATE TABLE `users` (
                       `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
                       `email` VARCHAR(255) NOT NULL UNIQUE,
                       `password` VARCHAR(255) NOT NULL
);
