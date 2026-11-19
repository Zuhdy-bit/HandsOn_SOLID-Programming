interface EngineVehicle {
    void startEngine();
}

interface FuelVehicle {
    void isiBahanBakar();
}

interface ElectricVehicle {
    void isiBaterai();
}

class MobilBensin implements EngineVehicle, FuelVehicle {
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin...");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil bensin...");
    }
}

class MobilListrik implements ElectricVehicle {
    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik...");
    }
}

class Sepeda {
    public void kayuh() {
        System.out.println("Sepeda dikayuh...");
    }
}

public class solidprogramming_latihan3 {
    public static void main(String[] args) {
        MobilBensin bensin = new MobilBensin();
        bensin.startEngine();
        bensin.isiBahanBakar();

        MobilListrik listrik = new MobilListrik();
        listrik.isiBaterai();

        Sepeda sepeda = new Sepeda();
        sepeda.kayuh();
    }
}