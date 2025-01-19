-- import defaults users
INSERT INTO users(email, password, firstname, lastname) VALUES('ludo.bernard@gmail.com', '123456', 'Ludo', 'Bernard');
INSERT INTO users(email, password, firstname, lastname) VALUES('michel.bernard@gmail.com', 'motdepasse', 'Michel', 'Bernard');
INSERT INTO users(email, password, firstname, lastname) VALUES('lucette.bernard@gmail.com', 'lulu', 'Lucette', 'Bernard');
INSERT INTO users(email, password, firstname, lastname) VALUES('melanie.bernard@gmail.com', 'english', 'Mélanie', 'Bernard');

-- import defaults alteration types
INSERT INTO alteration_type VALUES('annual', 'ANNUAL');
INSERT INTO alteration_type VALUES('monthly', 'MONTHLY');
INSERT INTO alteration_type VALUES('weekly', 'WEEKLY');
INSERT INTO alteration_type VALUES('daily', 'DAILY');