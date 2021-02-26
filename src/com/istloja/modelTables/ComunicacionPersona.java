package com.istloja.modelTables;

import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.istloja.modelo.Persona_Prov;

public interface ComunicacionPersona {
    void  clickPersona( Persona  p );
    void  clickPersonap(Persona_Prov p);
    void clickInventario(Inventario i);
}
