# Golf API ⛳

API REST desarrollada con Spring Boot para gestionar información sobre campos de golf, relacionada con la web "Golf Passion".

## 📦 Tecnología utilizada

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 🚀 Endpoints disponibles

| Método | Ruta              | Cuerpo (JSON)                                              | Descripción                                  | Respuestas posibles         |
|--------|-------------------|-------------------------------------------------------------|----------------------------------------------|-----------------------------|
| GET    | `/api/campos`     | —                                                           | Listar todos los campos de golf              | 200 OK                      |
| GET    | `/api/campos/{id}`| —                                                           | Obtener un campo de golf por su ID           | 200 OK, 404 Not Found       |
| POST   | `/api/campos`     | `{ "nombre": "...", "ubicacion": "...", "descripcion": "..." }` | Crear un nuevo campo de golf         | 201 Created, 400 Bad Request|
| PUT    | `/api/campos/{id}`| `{ "nombre": "...", "ubicacion": "...", "descripcion": "..." }` | Actualizar un campo existente         | 200 OK, 404 Not Found       |
| DELETE | `/api/campos/{id}`| —                                                           | Eliminar un campo de golf                    | 204 No Content, 404 Not Found|

---

## 💾 Base de datos H2

Se utiliza H2 como base de datos en memoria para pruebas.

Para acceder a la consola:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Usuario: `sa`
- Contraseña: *(vacía)*

---

## ✅ Estado

✔️ Proyecto funcional con operaciones CRUD completas.  
✔️ Relacionado con la web "Golf Passion".  
✔️ Preparado para entrega.

---

## 📬 Autor

Varinho // Ingeniería de Telecomunicaciones con Business Analytics  
