/**package com.example.springboot.telefonia.repository;

//import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface TelefoniaRepository<DateParams> extends TelefoniaService<DateParams,Long> {

        @Query("select new com.telefonia.springboot.dto.DateParams (d.dIni, d.dFin, d.service,"+
                " ) from dateParams d,"+
                "    WHERE d.dateParams = 'cerracol' AND"+
                "    d.dIni = 'yyyy-MM-DD HH:mm:ss'  AND"+
                "    d.dFin = 'yyyy-MM-DD HH:mm:ss' AND "+
                "    d.service = 'nombre del Servicio o servicios'")
        List<DateParams> getInfoFromassaabloy();
    }
*/