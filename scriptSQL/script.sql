CREATE TABLE dono (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    telefone VARCHAR(20)
);

CREATE TABLE animal (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    idade INT,
    raca VARCHAR(100),
    tipo VARCHAR(50),
    dono_id INT REFERENCES dono(id)
);

CREATE TABLE servico (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    preco DECIMAL
);

CREATE TABLE funcionario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    cargo VARCHAR(100)
);

CREATE TABLE atendimento (
    id SERIAL PRIMARY KEY,
    animal_id INT REFERENCES animal(id),
    dono_id INT REFERENCES dono(id),
    servico_id INT REFERENCES servico(id),
    funcionario_id INT REFERENCES funcionario(id),
    data DATE
);