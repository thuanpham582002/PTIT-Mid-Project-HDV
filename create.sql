create sequence car_package_seq start with 1 increment by 50;
create sequence car_parameters_seq start with 1 increment by 50;
create sequence cars_seq start with 1 increment by 50;
create table car_package (created_at date, price_per_hour float(53) not null, updated_at date, id bigint not null, package_name varchar(255), primary key (id));
create table car_parameters (fuel_type integer not null, is_air_conditioning_available boolean not null, number_of_doors integer not null, number_of_seats integer not null, transmission_type integer not null, id bigint not null, primary key (id));
create table cars (created_at date, is_available boolean not null, updated_at date, car_package_id bigint, car_parameters_id bigint unique, id bigint not null, brand varchar(255), color varchar(255), license_plate varchar(255), model varchar(255), primary key (id));
alter table if exists cars add constraint FK7sfsay3nalpxgqa77nd2yqvia foreign key (car_package_id) references car_package;
alter table if exists cars add constraint FKa2cm6f26r8rqcy9n6kvc4xx78 foreign key (car_parameters_id) references car_parameters;
