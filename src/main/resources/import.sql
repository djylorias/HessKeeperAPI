-- import defaults users
INSERT INTO users(email, password, firstname, lastname) VALUES('ludo.bernard@gmail.com', '123456', 'Ludo', 'Bernard');
INSERT INTO users(email, password, firstname, lastname) VALUES('michel.bernard@gmail.com', 'motdepasse', 'Michel', 'Bernard');
INSERT INTO users(email, password, firstname, lastname) VALUES('lucette.bernard@gmail.com', 'lulu', 'Lucette', 'Bernard');
INSERT INTO users(email, password, firstname, lastname) VALUES('melanie.bernard@gmail.com', 'english', 'Mélanie', 'Bernard');

-- import defaults alteration regularity
INSERT INTO alteration_regularity VALUES('annual', 'ANNUAL');
INSERT INTO alteration_regularity VALUES('monthly', 'MONTHLY');
INSERT INTO alteration_regularity VALUES('weekly', 'WEEKLY');
INSERT INTO alteration_regularity VALUES('daily', 'DAILY');

-- import defaults alteration types
INSERT INTO alteration_type VALUES('loan', 'LOAN');
INSERT INTO alteration_type VALUES('subscription', 'SUBSCRIPTION');
INSERT INTO alteration_type VALUES('insurance', 'INSURANCE');
INSERT INTO alteration_type VALUES('rent', 'RENT');