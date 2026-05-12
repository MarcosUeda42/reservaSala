package classes.rooms;

public class Factory_Room {
    
    public static Room createRoom(String type, int roomNumber, int capacity) {
        if (type.equalsIgnoreCase("individual")) {
            return new Individual_Room(roomNumber);
        } else if (type.equalsIgnoreCase("lab")) {
            return new Lab_Room(roomNumber);
        } else if (type.equalsIgnoreCase("grupo")) {
            return new Group_Room(roomNumber, capacity);
        }else if (type.equalsIgnoreCase("especial")) {
            return new Special_Room(roomNumber);
        } else {
             System.out.println("Tipo de sala inválido: " + type);
             return null;
        }
    }
}
