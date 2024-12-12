-- Inserts para a tabela account
INSERT INTO account (username, email, image_data, is_verified) VALUES
('user1', 'user1@example.com', 'http://example.com/image1.jpg', TRUE),
('user2', 'user2@example.com', 'http://example.com/image2.jpg', FALSE),
('user3', 'user3@example.com', 'http://example.com/image3.jpg', TRUE),
('user4', 'user4@example.com', 'http://example.com/image4.jpg', FALSE),
('user5', 'user5@example.com', 'http://example.com/image5.jpg', TRUE);

-- Inserts para a tabela account_password
INSERT INTO account_password (account_id, user_password, active) VALUES
(1, 'password1', TRUE),
(2, 'password2', TRUE),
(3, 'password3', FALSE),
(4, 'password4', TRUE),
(5, 'password5', FALSE);

-- Inserts para a tabela meetup
INSERT INTO meetup (title, information, cep_address, state_address, city_address, neighborhood_address, number_address, street_address, event_date, stage) VALUES
('Meetup 1', 'Description for meetup 1', '12345000', 'State A', 'City A', 'Neighborhood A', '100', 'Street A', '2024-12-15 10:00:00+00', 'PUBLISHED'),
('Meetup 2', 'Description for meetup 2', '12345001', 'State B', 'City B', 'Neighborhood B', '101', 'Street B', '2024-12-16 11:00:00+00', 'PUBLISHED'),
('Meetup 3', 'Description for meetup 3', '12345002', 'State C', 'City C', 'Neighborhood C', '102', 'Street C', '2024-12-17 12:00:00+00', 'CANCELED'),
('Meetup 4', 'Description for meetup 4', '12345003', 'State D', 'City D', 'Neighborhood D', '103', 'Street D', '2024-12-18 13:00:00+00', 'PUBLISHED'),
('Meetup 5', 'Description for meetup 5', '12345004', 'State E', 'City E', 'Neighborhood E', '104', 'Street E', '2024-12-19 14:00:00+00', 'CANCELED');

-- Inserts para a tabela meetup_image
INSERT INTO meetup_image (meetup_id, event_image) VALUES
(1, 'http://example.com/meetup1_image1.jpg'),
(1, 'http://example.com/meetup1_image2.jpg'),
(2, 'http://example.com/meetup2_image1.jpg'),
(3, 'http://example.com/meetup3_image1.jpg'),
(4, 'http://example.com/meetup4_image1.jpg');
