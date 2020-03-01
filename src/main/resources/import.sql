INSERT INTO usuarios (nombre,apellido,telefono,create_at) values ('victor','olmos','+56948631669','13-10-1990');
INSERT INTO usuarios (nombre,apellido,telefono,create_at) values ('javier','perales','+56948631669','13-10-1990');
INSERT INTO usuarios (nombre,apellido,telefono,create_at) values ('camila','santander','+56948631669','13-10-1990');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO cuentas (email,username,password,enable) values ('victor@gmail.com','admin','$2a$10$HCuxkM7duAhoSONRXoNH/O5FNSXZ9owAaTQKgM02LZx0SZRxyZ/.y',true);
INSERT INTO cuentas (email,username,password,enable) values('maria@gmail.com','maria','$2a$10$JlrTgzjNyOfqp79eRGy9ke4qHhW61k.3aG1FMKU1IzwgYx6svpN/G',false);

INSERT INTO cuentas_roles (cuenta_id, role_id)values (1,1)
INSERT INTO cuentas_roles (cuenta_id, role_id)values (1,2)
INSERT INTO cuentas_roles (cuenta_id, role_id)values (2,1)




