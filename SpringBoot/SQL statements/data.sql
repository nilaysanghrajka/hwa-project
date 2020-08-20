INSERT INTO Team (TeamName, TeamSide)
VALUES
('No Team', 'Neutral'),
('Justice League', 'Good'),
('Suicide Squad', 'Bad'),
('Avengers','Good'),
('Injustice League', 'Bad'),
('Rogues','Bad');

INSERT INTO Heroes (Name, Alter_ego, Location, Occupation, fk_TeamID)
VALUES
('Batman', 'Bruce Wayne','Gotham', 'Business Man', 2),
('Superman','Clark Kent','Metropolis', 'Reporter', 2),
('Ironman','Tony Stark','New York', 'Business Man', 4),
('Deadpool', 'Wade Wilson','Canada', 'Mercenary', 1);

INSERT INTO Villain (Name, Alter_ego, Location, Occupation, fk_TeamID)
VALUES
('Zoom','Hunter Zoloman','Keystone', 'Scientist', 3),
('Captain Cold','Leonard Snart','Gotham', 'Professional Criminal', 5),
('Lex Luthor','Lex Luthor','Smallville', 'Business Man', 5),
('Harley Quinn','Harleen Quinzel','Gotham', 'Pyschiatrist', 3);

INSERT INTO Nemesis (fk_Hero_ID, fk_Villain_ID)
VALUES
(2, 3),
(1, 4);
