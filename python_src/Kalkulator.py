class Kalkulator:
    def __init__(self, bil1, bil2):
        self.bil1 = bil1
        self.bil2 = bil2
    
    def tambah(self):
        hasil = self.bil1 + self.bil2
        print(hasil)
    
    def kurang(self):
        hasil = self.bil1 - self.bil2
        print(hasil)

    def kali(self):
        hasil = self.bil1 * self.bil2
        print(hasil)
    
    def bagi(self):
        hasil = self.bil1 / self.bil2
        print(hasil)

kal = Kalkulator(7.0, 4.0)
kal.tambah()