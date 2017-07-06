CREATE TABLE IF NOT EXISTS word(
    id            bigint IDENTITY PRIMARY KEY,
    original      VARCHAR(255),
    translation   VARCHAR(255)
);