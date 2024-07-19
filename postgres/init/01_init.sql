CREATE DATABASE demo;

-- CREATE USER appuser WITH PASSWORD 'password';
-- GRANT ALL PRIVILEGES ON SCHEMA public TO appuser;

\c demo

DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
  id SERIAL NOT NULL,
  customer_id INT NOT NULL,
  item_id INT NOT NULL,
  item_name VARCHAR(50),
  item_price INT NOT NULL,
  purchase_date timestamp,
  PRIMARY KEY (id)
);

