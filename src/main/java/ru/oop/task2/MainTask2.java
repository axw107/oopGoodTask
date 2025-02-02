package ru.oop.task2;

import ru.oop.task1.Car;

/**
 * <b>Задача 2:</b><br>
 * Добраться человеку до заданного места.<br>
 * Притом он может поехать не только на машине, а на автобусе,
 * метро, велосипеде или любом другом виде транспорта.<br>
 * Транспорт может задаваться, например, как new Car(person) или new Bus("43", person) и т.п.<br>
 * Стоит учесть, что может понадобится до транспорта дойти пешком.<br>
 * И не всегда можно подъехать прямо к нужному месту, может понадобиться дойти пешком.<br>
 * Человек знает своё текущее местоположение (у него есть метод {@link Person#getPosition()}<br>
 * Подсказка: появился интерфейс {@link Positioned}, его можно использовать для чего-то ещё<br>
 * <ul>
 *   <li>Код не должен превышать 7 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(...)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask2 {

    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     * @see Person
     * @see Position
     */
    // TODO реализовать метод moveTo(...)
    public void moveTo(Person person, Transport transport, Position destination) {

        if (!(person.getPosition() == transport.getPosition())) {
            person.walk(transport.getPosition());
        }

        person.move(transport, destination);

        if (!(person.getPosition() == destination)) {
            person.walk(destination);
        }

        assert person.getPosition() == destination;
    }
}
