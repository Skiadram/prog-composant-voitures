DROP TABLE IF EXISTS voiture;

CREATE TABLE voiture (
  id INT AUTO_INCREMENT,
  marque VARCHAR(250) NOT NULL,
  modele VARCHAR(250) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO voiture (marque,modele) VALUES('bmw','m4');
INSERT INTO voiture (marque,modele) VALUES('bugatti','chiron');
INSERT INTO voiture (marque,modele) VALUES('peugeot','307');

