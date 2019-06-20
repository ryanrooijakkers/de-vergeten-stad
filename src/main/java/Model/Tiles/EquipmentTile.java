package Model.Tiles;

import Model.equipment.Equipment;

public class EquipmentTile extends Tile {

    private static int aangemaaktTeller = 1;
    private Equipment equipment;

    public EquipmentTile(Equipment equipment){
        super("/Tiles/Undiscovered.png", "/placeholder.png", Varianten.EQUIPMENT);

        System.out.println("yes 1");
        String juistePNG = vindJuistePNG();

        System.out.println("yes 2");
        super.setDiscoveredImage(juistePNG);

        System.out.println("yes 3");
        aangemaaktTeller ++;

        System.out.println("Equipment maaken");
        this.equipment = equipment;
        System.out.println("equip init");
    }

    public String vindJuistePNG(){
        String pad = "/Tiles/Equipment_" + aangemaaktTeller + ".png";
        return pad;
    }


    /*public String vindJuistePNG(){
        String pad = null;
        String as;
        if(aangemaaktTeller % 2 == 1){
            as = "X";
        }
        else as = "Y";
        System.out.println(aangemaaktTeller);

        switch ((int) aangemaaktTeller / 2){
            case 0:
                pad = "/Tiles/Motor_" + as + ".png";
                break;
            case 1:
                pad = "/Tiles/Navigation_" + as + ".png";
                break;
            case 2:
                pad = "/Tiles/Crystal_" + as + ".png";
                break;
            case 3:
                pad = "Tiles/Propeller_" + as + ".png";
                break;
            default:
                pad = "/placeholder.png";
        }
        return pad;
    }*/

    public Equipment getEquipment() {
        return equipment;
    }

    public static void resetTeller(){
        aangemaaktTeller = 1;
    }

}
