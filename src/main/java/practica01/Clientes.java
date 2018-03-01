package practica01;

import java.util.HashMap;
import java.util.Map;

public class Clientes {

    private Map<String,Cliente> map;

    public Clientes(){
        this.map = new HashMap<String, Cliente>();
    }

    public Clientes(Map<String, Cliente> map){
        this.map = map;
    }

    public Map<String, Cliente> getMap(){
        return this.map;
    }

    public boolean añadirCli(Cliente cliente){
        map.put(cliente.getNIF(), cliente);
        if(map.containsKey(cliente.getNIF())){
            return true;
        }
        return false;
    }

    public  boolean eliminarCli(String nif){
        if(map.containsKey(nif)){
            map.remove(nif);
            return true;
        }
        return false;
    }

}
