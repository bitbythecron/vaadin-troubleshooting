--liquibase formatted sql

--changeset vt-dev:1 dbms:h2
CREATE TABLE field_app_settings (
    field_app_setting_id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    field_app_setting_ref_id VARCHAR(36) NOT NULL,
    field_app_setting_label VARCHAR(250) NOT NULL,
    field_app_setting_value VARCHAR(500) NOT NULL,
);

-- inserts
INSERT INTO
    field_app_settings
VALUES (
    1,
    'eaf8800b-12dd-4892-9929-51b207e13f27',
    'PREFERRED_LOCALE',
    'en_US'
);
