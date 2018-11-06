DROP TABLE IF EXISTS items;
CREATE TABLE items(price float, name VARCHAR(100), description VARCHAR (255), deliverytime integer, id uuid DEFAULT uuid_generate_v4 () PRIMARY KEY);