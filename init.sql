CREATE TABLE address (
    id SERIAL PRIMARY KEY,
    logradouro, numero, complemento, bairro, cidade, estado, cep
)

CREATE TABLE user (
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    email TEXT NOT NULL,
    birthdate DATE NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    address_id INTEGER references address(id)
);