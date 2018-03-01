package practica01;

import java.util.*;


public class Menu {

    private static Clientes listado;

    public enum OpcionesMenu {
        DAR_ALTA_CLIENTE("Dar de alta un nuevo cliente"),
        BORRAR_CLIENTE("Borrar un cliente"),
        CAMBIAR_TARIFA("Cambiar tarifa dde un cliente"),
        RECUPERAR_DATOS("Recuperar los datos de un cliente a través de su NIF"),
        LISTA_CLIENTES("Recuperar el listado de todos los clientes"),
        ALTA_LLAMADA("Dar de alta una llamada"),
        LLAMADAS_CLIENTE("Listar todas las llamadas de un cliente"),
        FACTURA_CLIENTE("Emitir factura de un cliente"),
        DATOS_FACTURA("Recuperar los datos de una factura a partir de su código"),
        TODAS_FACTURAS("Recuperar todas las facturas de un cliente");

        private String descripcion;

        OpcionesMenu(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public static String getMenu() {
            System.out.println("-------------------------------- APLICACIÓN --------------------------------\n");
            StringBuilder sb = new StringBuilder();
            for (OpcionesMenu opcion : OpcionesMenu.values()) {
                sb.append(opcion.ordinal());
                sb.append(")\t");
                sb.append(opcion.getDescripcion());
                sb.append("\n");
            }
            return sb.toString();
        }

        public static OpcionesMenu getOpcion(int posicion) {
            return values()[posicion];
        }

    }




    public static void main(String[] args) {
        System.out.println(OpcionesMenu.getMenu());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elije una opción:");
        byte opcion = scanner.nextByte();
        OpcionesMenu opcionMenu = OpcionesMenu.getOpcion(opcion);
        switch (opcionMenu) {
            case DAR_ALTA_CLIENTE:
                System.out.println("0");
                break;
            case BORRAR_CLIENTE:
                System.out.println("1");
                break;
            case CAMBIAR_TARIFA:
                System.out.println("2");
                break;
            case RECUPERAR_DATOS:
                //llamada a funcion
                break;
            case LISTA_CLIENTES:
                break;
            case ALTA_LLAMADA:
                break;
            case LLAMADAS_CLIENTE:
                break;
            case FACTURA_CLIENTE:
                break;
            case DATOS_FACTURA:
                break;
            case TODAS_FACTURAS:
                break;
            default:
               System.out.println("3");

        }



        /*
        do{
            System.out.print("Elige una opción para llevar a cabo la operación deseada('exit' para salir): \n\n" +
                    "------------------------- CLIENTES -------------------------\n\n" +

                    "Opción: ");
            int opcion = 0;
            do{
                try{
                    opcion = sc.nextInt();
                    break;
                }catch(Exception e){
                    System.exit(0);
                }
            }while(true);

            String nif;
            switch (opcion){
                case 1:
                    altaCliente();
                    break;
                case 2:
                    do{
                        nif = recogerDato("NIF: ");
                    }while(comprobarNIF(nif) != true);
                    listado.eliminarCli(nif);
                    break;
                case 3:
                    do{
                        nif = recogerDato("NIF: ");
                    }while(comprobarNIF(nif) != true);
                    Map<String, Cliente> mapa = listado.getMap();
                    if(mapa.containsKey(nif)){
                        double importe;
                        do{
                            importe = Double.parseDouble(recogerDato("Tarifa: "));
                        }while(importe < 0);
                        Tarifa tarifa = new Tarifa(importe);
                        mapa.get(nif).setTarifa(tarifa);
                    }else{
                        System.out.println("No se encuentra ese cliente en el listado.");
                    }
                    break;
                case 4:
                    do{
                        nif = recogerDato("NIF: ");
                    }while(comprobarNIF(nif) != true );
                    mapa = listado.getMap();
                    if(mapa.containsKey(nif)){
                        Cliente cliente = mapa.get(nif);
                        System.out.println("Cliente encontrado");
                    }else{
                        System.out.println("No existe el cliente en el listado.");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Opción no disponible. Por favor, elija alguna" +
                            " de las opciones disponibles o introduzca 'exit' para salir");
            }
        }while(true);*/


        }
    }

