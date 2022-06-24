NOTA IMPORTANTE: Tener en cuenta que el @Autowired del service debe encima de cada instaciación de cada repo(por ejm como se hizo en la "trampita alcaldía")

# crudBackByetcs
# Querys:
Query para insertar employees:
insert into employee(id, name) values(1, 'Emp1')

Query para seleccionar todos los empleados:
select * from employee

Query para insertar works:
insert into work(id, status, date, retdays, empasign) values(3, 'Pendiente','01/12/2022/12:12:12', 171, 3)

# con el back corriendo tenemos los sgtes endpoints: 
con get
localhost:8081/getemployeelist

Para añadir empleado:
con post 
localhost:8081/addemployee

en raw, body:
{
    "id": 3,
    "name": "Emp3"
}

para obtener solo un empleado por el id:
con get:
localhost:8081/getemployeebyid/3

para borrar un empleado por el id:
con post
localhost:8081/deleteemployeebyid/3

Nota: Se debe tener en cuenta que para editar un empleado simplemente es crearlo con el id ya existente y se sobreescriben los otros campos.

PARA LO REFERENTE A LAS ACTIVIDADES:
con get
localhost:8081/getworklist
con post 
localhost:8081/addwork

en raw, body:

{
    "id": 3,
    "status": "Pendiente",
    "date": "01/12/2022/12:12:12",
    "retdays": 171,
    "empAsign": 3
}
	
con post
localhost:8081/deleteworkbyid/3