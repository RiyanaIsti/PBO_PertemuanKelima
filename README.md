## Tugas PBO: Custom Exception dan CRUD menggunakan Form

Pada tugas praktikum kali ini saya membuat satu contoh class Custom Exception untuk penanganan eror yang lebih terstruktur dan satu class FilmBioskop yang mengimplementasikan CRUD dengan Form.

## 1. Custom Exception
Custom exception adalah exception yang dibuat sendiri oleh programmer dengan cara membuat kelas baru yang mewarisi (extends) kelas Exception atau RuntimeException. Tujuannya adalah memberikan pesan kesalahan yang lebih spesifik dan sesuai dengan konteks aplikasi.
Keuntungan penggunaan custom exception antara lain:
- Memberikan pesan error yang lebih jelas.
- Membantu proses debugging.
- Membuat program lebih terstruktur dan mudah dipelihara.
  
Contoh source code:


        try {
  
            validasiNIM("09010624014");   // contoh input
  
        } catch (NIMTidakValidException e) {
  
            System.out.println("Terjadi kesalahan: " + e.getMessage());
  
        }
  

  
Pada program ini method validasiNIM akan mengecek NIM yang telah diinputkan di-try. Jika panjang NIM tidak 10 digit, maka akan dilemparkan pada method NIMTidakValidException yang ditangkap oleh catch dan akan menampilkan pesan kesalahan.

## 2. CRUD menggunakan Form
CRUD (Create, Read, Update, Delete) adalah empat operasi utama yang digunakan dalam pengelolaan data pada basis data. Dalam pemrograman Java, CRUD dapat diimplementasikan dengan memanfaatkan Java Swing sebagai antarmuka pengguna (GUI) dan JDBC (Java Database Connectivity) sebagai penghubung ke database, misalnya PostgreSQL.
- Create (Insert Data).
Operasi create digunakan untuk menambahkan data baru ke dalam tabel database. Pada Java Form, data diambil dari komponen input seperti JTextField, kemudian dikirim ke database menggunakan perintah INSERT INTO melalui PreparedStatement.
- Read (Menampilkan Data).
Operasi read digunakan untuk membaca data dari database dan menampilkannya pada tabel (JTable). Data diambil dengan query SELECT, lalu diolah menggunakan ResultSet dan DefaultTableModel sebelum ditampilkan di tabel pada form.
- Update (Mengubah Data).
Operasi update digunakan untuk memperbarui data yang sudah ada. Proses ini dilakukan dengan query UPDATE dan memanfaatkan PreparedStatement agar lebih aman serta terhindar dari SQL Injection.
- Delete (Menghapus Data).
Operasi delete digunakan untuk menghapus data dari tabel. Pada Java Form, biasanya disertai konfirmasi melalui JOptionPane sebelum data benar-benar dihapus dengan query DELETE.
Dengan menggabungkan Java Swing, JDBC, dan PostgreSQL, aplikasi CRUD dapat dibuat secara interaktif. Antarmuka JFrame dan komponen seperti JButton, JTextField, serta JTable berfungsi sebagai media input-output, sedangkan JDBC mengatur komunikasi langsung dengan database.

Penjelasan Singkat Kode
- showTable() → menampilkan data film dari database ke JTable.
- btnInsertActionPerformed() → menambah data baru ke tabel film.
- btnUpdateActionPerformed() → mengubah data film berdasarkan ID.
- btnDeleteActionPerformed() → menghapus data film setelah konfirmasi.
- btnClearActionPerformed() → mengosongkan semua field input.
- CloseActionPerformed() → menutup aplikasi dan menghentikan program.
