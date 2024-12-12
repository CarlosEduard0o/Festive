drop database if exists festive;
create database festive;

\c festive;

begin;

CREATE TABLE account (
    id SERIAL PRIMARY KEY,
    username VARCHAR(150) NOT NULL UNIQUE,
    email VARCHAR(200) NOT NULL UNIQUE,
    image_data BYTEA,
    is_verified BOOLEAN DEFAULT FALSE
);

CREATE TABLE account_password (
    id SERIAL PRIMARY KEY,
    account_id INTEGER NOT NULL,
    user_password VARCHAR(1024) NOT NULL,
    active BOOLEAN NOT NULL DEFAULT FALSE,
    FOREIGN KEY (account_id) REFERENCES account(id) ON DELETE CASCADE,
    UNIQUE(account_id, user_password)
);

CREATE TABLE meetup (
    id SERIAL PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    information VARCHAR(1024) NOT NULL,

    cep_address VARCHAR(9), 
    state_address VARCHAR(200), 
    city_address VARCHAR(200), 
    neighborhood_address VARCHAR(200), 
    number_address VARCHAR(200), 
    street_address VARCHAR(200),

    event_date TIMESTAMP WITH TIME ZONE NOT NULL,
    stage VARCHAR(200) NOT NULL CHECK (stage IN ('PUBLISHED', 'CANCELED')),
    UNIQUE(title, information, event_date, cep_address)
);

CREATE TABLE meeup_image (
    id SERIAL PRIMARY KEY,
    meetup_id INTEGER NOT NULL,
    event_image BYTEA,
    FOREIGN KEY (meetup_id) REFERENCES meetup(id) ON DELETE CASCADE,
    UNIQUE(meetup_id, event_image)
);

COMMIT;