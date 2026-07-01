package application.menu.entities;

import application.menu.enums.TableStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Table {

    private int number;
    private int maxSeats;
    private TableStatus tableStatus;

    // no-arg constructor
    public Table() {}

    // constructor
    @Autowired
    public Table(int number, int maxSeats, TableStatus tableStatus) {};


    // getters

    public int getNumber() {
        return number;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public TableStatus getTableStatus() {
        return tableStatus;
    }


    // setters

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus;
    }


    // methods


}

