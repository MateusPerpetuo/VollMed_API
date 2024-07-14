alter table consultas add column cancelamento tinyint;
alter table consultas add column motivo_cancelamento varchar (100);
update consultas set cancelamento = 0;