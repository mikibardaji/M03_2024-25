USE pokemondb;

DROP TABLE capturas;
DROP TABLE entrenadors;
DROP TABLE pokemons;

CREATE TABLE entrenadors(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) UNIQUE,
    password VARCHAR(50) NOT NULL
);

CREATE TABLE pokemons(
    num_pokedex INT PRIMARY KEY,
    nom VARCHAR(50) UNIQUE,
    tipo VARCHAR(50)
);

CREATE TABLE capturas (
    trainer_id INT,
    pokemon_id INT,
    cp INT,
    PRIMARY KEY (trainer_id, pokemon_id),
    FOREIGN KEY (trainer_id) REFERENCES entrenadors(id),
    FOREIGN KEY (pokemon_id) REFERENCES pokemons(num_pokedex)
) ENGINE=InnoDB;


INSERT INTO entrenadors (nom, password) 
VALUES 
    ('AshKetchum', 'pokedex123'),
    ('MistyWater', 'waterpower456'),
    ('BrockRocks', 'rockgym789');


INSERT INTO pokemons (num_pokedex, nom, tipo) 
VALUES 
    (25, 'Pikachu', 'Eléctrico'),   -- Pikachu es el #25
    (1, 'Bulbasaur', 'Planta'),     -- Bulbasaur es el #1
    (4, 'Charmander', 'Fuego'),     -- Charmander es el #4
    (7, 'Squirtle', 'Agua'),        -- Squirtle es el #7
    (95, 'Onix', 'Roca');           -- Onix es el #95

INSERT INTO capturas (trainer_id, pokemon_id, cp) 
VALUES 
    (1, 25, 500),  -- Ash captura a Pikachu con 500 CP
    (1, 1, 450),   -- Ash captura a Bulbasaur con 450 CP
    (2, 4, 400),   -- Misty captura a Charmander con 400 CP
    (2, 7, 420),   -- Misty captura a Squirtle con 420 CP
    (3, 95, 600);  -- Brock captura a Onix con 600 CP