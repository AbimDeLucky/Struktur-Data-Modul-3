# membuat sebuah stack kosong
stack = []

# menambahkan elemen ke stack
stack.append("Aku")
stack.append("Anak")
stack.append("Indonesia")

# mencetak elemen teratas di stack
print("Next : " + stack[-1])

# menambahkan elemen baru ke stack dan menghapus elemen teratas
stack.append("Raya")
print(stack.pop())

# menambahkan elemen baru ke stack dan karakter '!' ke elemen teratas
stack.append("!")

# menghitung jumlah kemunculan 'Aku' di stack
count = stack.count("Aku")

# menghapus semua elemen 'Aku' kecuali elemen teratas
while count != -1 and count >= 0:
    stack.pop()
    count -= 1

# menghapus elemen teratas dari stack dan mencetaknya
print(stack.pop())

# mengecek apakah stack kosong dan mencetak hasilnya
print(bool(stack))
