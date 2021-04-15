package com.istloja.modelTables;

import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.istloja.modelo.Persona_Prov;
import com.istloja.modelo.ProductoVenta;

public interface ComunicacionPersona {
    void  clickPersona( Persona  p );
    void  clickPersonap(Persona_Prov pp);
    void clickInventario(Inventario i);
    void clickProductoVender (ProductoVenta pv);
}
