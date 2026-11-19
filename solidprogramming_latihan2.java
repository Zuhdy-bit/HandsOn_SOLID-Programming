class StudentGrader {
    public double hitungNilaiAkhir(
            double tugas, double uts, double uas
    ) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

class GradeReport {
    public void cetakLaporan(String nama, double nilai) {
        System.out.println(
                "Laporan Nilai Mahasiswa: " + nama + " = " + nilai
        );
    }
}

class GradeRepository {
    public void simpanDatabase(String nama, double nilai) {
        System.out.println(
                "Menyimpan ke database: " + nama + " = " + nilai
        );
    }
}

public class solidprogramming_latihan2 {
    public static void main(String[] args) {
        StudentGrader grader = new StudentGrader();
        GradeReport report = new GradeReport();
        GradeRepository repository = new GradeRepository();

        double nilai = grader.hitungNilaiAkhir(80, 85, 90);

        report.cetakLaporan("Andi", nilai);
        repository.simpanDatabase("Andi", nilai);
    }
}