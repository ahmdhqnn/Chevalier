fun main() {

    print("Masukkan nama: ")
    val nama = readLine() ?: ""

    print("Masukkan NIM: ")
    val nim = readLine() ?: ""

    print("Masukkan jurusan: ")
    val jurusan = readLine() ?: ""

    val print ="""

    Data Mahasiswa
    Nama: $nama
    NIM: $nim
    Jurusan: $jurusan
    
    """.trimIndent()

    println(print)
}
