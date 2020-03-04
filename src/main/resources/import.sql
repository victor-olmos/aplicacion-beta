INSERT INTO usuarios (email,enable,password,username) values ('victor@gmail.com',true,'$2a$10$HCuxkM7duAhoSONRXoNH/O5FNSXZ9owAaTQKgM02LZx0SZRxyZ/.y','zikarius');
INSERT INTO usuarios (email,enable,password,username) values ('admin@gmail.com',true,'$2a$10$HCuxkM7duAhoSONRXoNH/O5FNSXZ9owAaTQKgM02LZx0SZRxyZ/.y','admin');
INSERT INTO usuarios (email,enable,password,username) values ('firulais@gmail.com',true,'$2a$10$HCuxkM7duAhoSONRXoNH/O5FNSXZ9owAaTQKgM02LZx0SZRxyZ/.y','firulais');
INSERT INTO usuarios (email,enable,password,username) values ('donbigotes@gmail.com',true,'$2a$10$HCuxkM7duAhoSONRXoNH/O5FNSXZ9owAaTQKgM02LZx0SZRxyZ/.y','bigotes');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id)values (1,1)
INSERT INTO usuarios_roles (usuario_id, role_id)values (1,2)
INSERT INTO usuarios_roles (usuario_id, role_id)values (2,1)
INSERT INTO usuarios_roles (usuario_id, role_id)values (3,1)

INSERT INTO regiones (nombre_region) VALUES ('Arica y Parinacota');
INSERT INTO regiones (nombre_region) VALUES ('Tarapacá');
INSERT INTO regiones (nombre_region) VALUES ('Antofagasta');
INSERT INTO regiones (nombre_region) VALUES ('Atacama');
INSERT INTO regiones (nombre_region) VALUES ('Coquimbo');
INSERT INTO regiones (nombre_region) VALUES ('Valparaiso');
INSERT INTO regiones (nombre_region) VALUES ('Metropolitana de Santiago');
INSERT INTO regiones (nombre_region) VALUES ('Libertador General Bernardo O Higgins');
INSERT INTO regiones (nombre_region) VALUES ('Maule');
INSERT INTO regiones (nombre_region) VALUES ('Biobío');
INSERT INTO regiones (nombre_region) VALUES ('La Araucanía');
INSERT INTO regiones (nombre_region) VALUES ('Los Ríos');
INSERT INTO regiones (nombre_region) VALUES ('Los Lagos');
INSERT INTO regiones (nombre_region) VALUES ('Aisén del General Carlos Ibáñez del Campo');
INSERT INTO regiones (nombre_region) VALUES ('Magallanes y de la Antártica Chilena');


INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Coquimbo',1);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Vicuña',1);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Salamanca',1);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Illapel',1);

INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Valparaiso',2);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Viña del mar',2);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Con con',2);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Reñaca',2);

INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Concepcion',3);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('mulchen',3);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('lota',3);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('san pedro',3);

INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('La florida',4);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('San bernardo',4);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('La pintana',4);
INSERT INTO ciudades (nombre_ciudad, region_id) VALUES ('Vitacura',4);







