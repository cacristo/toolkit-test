CREATE DATABASE IF NOT EXISTS toolkit;
USE toolkit;

-- Create table
CREATE TABLE IF NOT EXISTS `toolkit`.`roles`
(
    `code` VARCHAR(10)  NOT NULL,
    `name` VARCHAR(255) NULL DEFAULT NULL,
    PRIMARY KEY (`code`)
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `toolkit`.`users`
(
    `id`               BIGINT(20)   NOT NULL,
    `first_name`       VARCHAR(255) NOT NULL,
    `last_name`        VARCHAR(255) NOT NULL,
    `email`            VARCHAR(255) NOT NULL,
    `phone`            VARCHAR(255) NOT NULL,
    `activity`         VARCHAR(255) NOT NULL,
    `role_code`        VARCHAR(10)  NOT NULL,
    `version`          BIGINT(20)   NOT NULL,
    `creation_date`    DATETIME,
    `creation_user`    VARCHAR(255),
    `last_update_date` DATETIME,
    `last_update_user` VARCHAR(255),
    PRIMARY KEY (`id`),
    CONSTRAINT USER_ROLE_ID_FK FOREIGN KEY (`role_code`) REFERENCES roles (`code`)
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

-- Add data
INSERT INTO roles
    (`code`, `name`)
VALUES ('ADM', 'Administrator'),
       ('SPA', 'Supervisor activities'),
       ('CAA', 'Consultant all activities'),
       ('CBA', 'Consultant by activity')
;

INSERT INTO users
(`id`, `first_name`, `last_name`, `email`, `phone`, `activity`, `role_code`, `version`, `creation_date`,
 `creation_user`)
VALUES (1, 'John', 'Doe', 'john_doe@gmai.com', '0034 00 00 00 22', 'Board Consultant', 'CAA', 1, SYSDATE(), 'Script'),
       (2, 'Jane', 'Doe', 'jane_doe@gmai.com', '0034 00 00 20 20', 'System Administrator', 'ADM', 1, SYSDATE(),
        'Script')
;