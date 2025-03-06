class ComplexNumber {
    double real;
    double imaginary;

    // Constructor (Yapıcı Metot)
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Karmaşık Sayıları Toplayan Metot
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Sonucu String olarak döndürme
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        // Örnek olarak iki karmaşık sayı oluşturalım
        ComplexNumber num1 = new ComplexNumber(6.5, 2.5);
        ComplexNumber num2 = new ComplexNumber(1.5, 4.5);

        // Karmaşık sayıların toplamını al
        ComplexNumber sum = num1.add(num2);

        // Sonucu ekrana yazdır
        System.out.println("Toplam: " + sum);
    }
}
