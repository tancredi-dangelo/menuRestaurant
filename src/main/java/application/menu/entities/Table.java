package application.menu.entities;

import application.menu.enums.TableState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Table {

    private int number;
    private int maxSeats;
    private TableState tableState;

    @Autowired
    public Table(int number, int maxSeats, TableState tableState) {};


}

