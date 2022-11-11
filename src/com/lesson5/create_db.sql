CREATE DATABASE jaegers;
\c jaegers;
CREATE TABLE jaegers (
    id          SERIAL   NOT NULL PRIMARY KEY,
    modelname   VARCHAR(50) NOT NULL,
    mark        VARCHAR(20) NOT NULL,
    height      NUMERIC(6,2),
    weight      NUMERIC(6,3),
    status      VARCHAR(10),
    origin      VARCHAR(50),
    launch      DATE,
    kaijukill   INTEGER
);