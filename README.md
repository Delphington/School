# SchoolSystem API



## Введение
School system - это RESTful API, предназначенный для управления информацией об учениках. Он позволяет пользователям добавлять, обновлять, извлекать и удалять записи об учениках. Система имеет многоуровневую архитектуру (контроллер, служба, хранилище и модель)

## Используемые технологии
### Базовый стек:
- **Java 11**:
- **Spring Boot**
    - Spring MVC
    - Spring Data JPA
    - Spring Web
- **Maven**:
- **MySQL**:
- **Lombok**:


### Архитектура проекта:
- **Контроллер**: Обрабатывает HTTP-запросы.
- **Сервис**: Содержит бизнес-логику.
- **Репозиторий**: Управляет операциями с базой данных.
- **Модель**: Определяет структуру данных.

---

#


## Конечные точки API
- **POST /students** - Добавить нового студента
- **PUT /students** - Обновить существующего студента
- **ПОЛУЧИТЬ /students/{id}** - Получить студента по идентификатору
- **Получить /students** - Получить всех студентов
- **УДАЛИТЬ /students/{id}** - Удалить студента по идентификатору

### Пример запроса и ответа:

**Запрос**
```json
{
  "имя": "Михаил",
"возраст": 14,
"класс": "10-й"
}
```
**Ответ**:
```json
{
"id": 1,
"имя": "Михаил",
"возраст": 14,
"класс": "10-й"
}
```

### Как запустить
1. **Клонировать репозиторий**:
   ```bash
    git clone https://github.com/Delphington/School.git
   ```
2. **Создайте проект**:
   ```bash
   mvn clean install
   ```
3. **Запустите приложение**:
   ```bash
   mvn spring-boot:run
   ```
