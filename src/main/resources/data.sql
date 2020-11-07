# Create schemas

# Create tables
CREATE TABLE IF NOT EXISTS marque
(
    id_marque INT NOT NULL,
    nom VARCHAR(250) NOT NULL,
    PRIMARY KEY(id_marque)
);

CREATE TABLE IF NOT EXISTS Voiture
(
    id_voiture INT NOT NULL,
    nom VARCHAR(250) NOT NULL,
    id_client INT NOT NULL,
    modele VARCHAR(250) NOT NULL,
    PRIMARY KEY(id_voiture)
);

CREATE TABLE IF NOT EXISTS concessionaire
(
    id_concessionaire INT NOT NULL,
    nom VARCHAR(250) NOT NULL,
    PRIMARY KEY(id_concessionaire)
);

CREATE TABLE IF NOT EXISTS adresse
(
    id_adresse INT NOT NULL,
    libelle VARCHAR(250) NOT NULL,
    co_id INT NOT NULL,
    PRIMARY KEY(id_adresse)
);

CREATE TABLE IF NOT EXISTS client
(
    id_client INT NOT NULL,
    nom VARCHAR(250) NOT NULL,
    PRIMARY KEY(id_client)
);

CREATE TABLE IF NOT EXISTS mar_co
(
    id_marque VARCHAR(250) NOT NULL,
    id_concessionaire INT NOT NULL,
    PRIMARY KEY(id_marque, id_concessionaire)
);


# Create FKs
ALTER TABLE Voiture
    ADD    FOREIGN KEY (nom)
    REFERENCES marque(nom)
;
    
ALTER TABLE adresse
    ADD    FOREIGN KEY (co_id)
    REFERENCES concessionaire(id_concessionaire)
;
    
ALTER TABLE Voiture
    ADD    FOREIGN KEY (id_client)
    REFERENCES client(id_client)
;
    
ALTER TABLE mar_co
    ADD    FOREIGN KEY (id_marque)
    REFERENCES marque(nom)
;
    
ALTER TABLE mar_co
    ADD    FOREIGN KEY (id_concessionaire)
    REFERENCES concessionaire(id_concessionaire)
;
    

# Create Indexes

