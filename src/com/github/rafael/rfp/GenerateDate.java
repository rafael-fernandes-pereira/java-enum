package com.github.rafael.rfp;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

public class GenerateDate {

    public static Date execute(){
        Random random = new Random();
        int minDay = (int) LocalDate.of(2019, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2020, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

        return Date.from(randomDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

}
