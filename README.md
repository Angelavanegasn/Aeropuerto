Antes de crear el proyecto cree un Diagrama de clases y de componentes.





Diagrama de componentes





1.Creo la información de la base de datos con DBdesigner de la base de datos, que me sirve para guiarme de la estructura que haré de la base de datos del proyecto.




2.Creo un proyecto en spring boot donde solo se hará un microservicio para el proyecto con el ide Intellij.

3. Creamos el proyecto en spring initializr con maven, inyectando las dependencias que usaremos qué es spring web,spring devtools,spring jpa , postgresql , después de creamos lo importamos en intellij.


4.Creo el paquete modelo donde estará la clase que usare para colocar los atributos de la clase, con los metodos getter y setter.



5. Creo una clase controller dónde hago las peticiones http, por medio de postman se probó de que funcionaran correctamente por json, lo que es el get y el post


6. creó un paquete llamado repository es donde esta las funcionalidades del CRUD, crear una interfaz e implementó  crudrepository que es de spring boot, con esto ya tenemos nuestro repository con las operaciones del crud que usaremos desde nuestro service.





7. creó un paquete de service con una clase y una interfaz.
en la clase se creará todo lo de las funcionalidades de nuestros métodos.





