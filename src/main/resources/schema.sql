CREATE TABLE IF NOT EXISTS word(
    id            BIGINT IDENTITY PRIMARY KEY,
    original      VARCHAR(255),
    translation   VARCHAR(255)
);