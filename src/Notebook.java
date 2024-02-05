/*
Формат сдачи: ссылка на репозиторий в GitHub.

Задание

-Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
методы. Реализовать в java.
- Создать множество ноутбуков.
- Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
- Далее нужно запросить минимальные значения для указанных критериев - сохранить
параметры фильтрации можно также в Map.
- Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
условиям.
 */

import java.util.Objects;

public class Notebook {

    private String name;
    private int ramInGB;
    private int valueHDD;
    private String operatingSystem;
    private String color;

    public Notebook(String name, int ramInGB, int valueHDD, String operatingSystem, String color) {
        this.name = name;
        this.ramInGB = ramInGB;
        this.valueHDD = valueHDD;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRamInGB() {
        return ramInGB;
    }
    public void setRamInGB(int ramInGB) {
        this.ramInGB = ramInGB;
    }

    public int getValueHDD() {
        return valueHDD;
    }
    public void setValueHDD(int valueHDD) {
        this.valueHDD = valueHDD;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {this.operatingSystem = operatingSystem;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}


    @Override
    public String toString() {
        return "Notebook{" +
                "Наименование: '" + name + '\'' +
                ", оперативная память: " + ramInGB +
                ", объём жесткого диска: " + valueHDD +
                ", операционная система: " + operatingSystem +
                ", цвет корпуса: '" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Notebook note = (Notebook) obj;
        return name.equals(note.name) && ramInGB == note.ramInGB && valueHDD == note.valueHDD && operatingSystem.equals(note.operatingSystem) && color.equals(note.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,ramInGB,valueHDD,operatingSystem,color);
    }
}