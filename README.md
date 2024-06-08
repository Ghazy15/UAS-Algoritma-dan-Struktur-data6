# UAS-Algoritma-dan-Struktur-data6

Anggota:
1. Ghazy Aulia Wicaksana - 2305941
2. Muhamad Haidar Ali Putra Surya - 2309283
3. Muhammad Kautsar - 2310879
4. Muhammad Naufal Alifauzi - 2308688
5. Muhammad Syaban Fauzan - 2300782

SOAL 6: Legolas Si Tukang Berlian di Utopia
Pada zaman dahulu, ada negara damai dan makmur bernama Utopia. Legolas, seorang tukang berlian, bisa bebas bepergian dari kota ke kota untuk menjual berlian yang ia desain ke semua orang. Semua kota dapat dengan mudah dikunjungi oleh Legolas melalui jalan-jalan yang menghubungkan setiap kota di Utopia. Dia biasa menyusuri setiap kota di Utopia setidaknya satu kali untuk menawarkan berlian buatannya.
Namun, semuanya berubah setelah perang melanda Utopia. Terbentuk persekutuan di Utopia. Penduduk tidak lagi bebas untuk bepergian mengunjungi kota-kota yang ada di sana. Utopia menjadi negara yang terbagi ke dalam persekutuan/aliansi berwarna. Setiap kota tergabung dalam minimal satu dan maksimal dua aliansi (warna). Untuk masuk ke dalam sebuah kota, penduduk perlu menunjukkan tiket yang sesuai dengan salah satu warna aliansi kota tersebut pada petugas penjaga perbatasan. Saat keluar, dia akan menerima tiket lain (warna yang berbeda-jika masuk ke aliansi ganda, tiket dengan warna yang sama jika kota tersebut hanya tergabung ke dalam satu aliansi saja).
Sebagai penduduk senior dan disegani di Utopia, Legolas diperbolehkan memilih tiket dan kota yang ingin dia masuki sebagai kota pertama saat ia hendak akan berjualan keliling Utopia. Namun setelah itu dia harus mematuhi aturan aliansi. Ia ingin melakukan rutinitas yang sama seperti dulu, mengunjungi setiap kota tepat satu kali di Utopia. Kini tidak mudah baginya untuk melakukan hal tersebut, meski ia bisa memilih dari mana akan memulai perjalanan bisnisnya.
Contoh:
Misal, ada 4 kota (0-3).
Kota 0: aliansi merah & hijau;
Kota 1: aliansi merah; 
Kota 2: aliansi hijau & kuning; 
Kota 3: aliansi biru & merah.
- Jika Legolas mulai di kota 0 dengan tiket merah, dia keluar kota 0 dengan membawa tiket 
hijau. 
- Sekarang hanya kota 2 yang bisa dikunjungi (dan keluar dari kota 2 dengan tiket kuning).
- Keluar kota 2, dia terima tiket kuning dan tidak bisa ke mana-mana lagi.
- Jika Legolas mulai di kota 0 dengan tiket hijau, dia keluar kota 0 dengan tiket merah.
- Sekarang dia bisa ke kota 1 atau 3 menggunakan tiket merah tersebut.
- Jika dia memilih ke kota 3, dia akan keluar dengan tiket biru dan tidak bisa kemana-mana 
lagi (kota 1 dan 2 tidak berhasil dikunjungi).
- Jika dia memilih ke kota 1 setelah dari 0, dia mendapat tiket merah untuk ke kota 3. Keluar 
dari kota 3 dengan tiket biru, dia tidak bisa berkunjung ke kota 2.
- Jadi, tidak mungkin mengunjungi semua kota jika Legolas mulai dari kota 0.

Tapi, ternyata, memungkinkan untuk mengunjungi semua kota jika Legolas mulai dari kota 2 dengan tiket kuning
- Masuk kota 2 dengan tiket kuning, keluar dengan membawa tiket hijau.
- Lalu ke kota 0 dan keluar dengan tiket merah.
- Menuju kota 1 dengan tiket merah dan pulang dari kota tersebut dengan tiket merah lagi (karena kota 1 hanya tergabung ke dalam 1 aliansi, sehingga tiket yang dibawa pulang boleh sama dengan tiket yang dipakai untuk masuk).
- Masuk kota 3 dengan memakai tiket merah.Seperti yang Anda lihat, sangat sulit bagi Legolas si tukang berlian untuk menyelesaikan tugasnya. Oleh sebab itu, dia meminta Anda membantunya. Dia ingin tahu kota mana yang harus dia pilih untuk memulai perjalanan, sehingga dia dapat melakukan perjalanan ke semua kota di Utopia tepat satu kali.
Bisakah kamu membantu Legolas?
