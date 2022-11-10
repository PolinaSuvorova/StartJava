CREATE TABLE Jaegers (
id SERIAL NOT NULL PRIMARY KEY,
modelName VARCHAR(50) NOT NULL,
mark VARCHAR(20) NOT NULL,
height numeric(6,2),
weight numeric(6,3),
status VARCHAR(10),
origin VARCHAR(50),
launch DATE,
kaijuKill INTEGER
);