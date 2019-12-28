# ProgrammersDay

Программные требования для запуска сервиса:
- JDK версия 8
- Gradle версии не ниже 4.10
- Apache Tomcat

Сервис выводит дату 256 дня.
В зависимости от того, является ли год високосным, это либо 12.09, либо 13.09.

### Примеры работы программы с различными аргументами на входе ###

Пример 1: некорректные входные данные
```sh
  Request: http://localhost:80/?year="abcdef"
  Response: {"errorCode": 400, "dataMessage": "Неверно указан год"}
  Comment: Обработка некорректного ввода данных. Год должен быть задан числом от 0 до 9999.
```
Пример 2: корректные входные данные (високосный год)
```sh
Request: http://localhost:80/?year=2012
Response: {"errorCode": 200, "dataMessage": "12/09/2012"}
```

Пример 3: корректные входные данные (обычный год)
```sh
Request: http://localhost:80/?year=2013
Response: {"errorCode": 200, "dataMessage": "13/09/2013"}
```
