# P_Fragments

Bahan Ajar Fundamental Pemrograman Java (Android): Mengenal, Membuat dan Mengimplementasikan Fragment ke Dalam Activity. <br>
 
## Sekilas

Sekarang kita akan coba mempelajari, membuat dan mengimplementasikan Fragment ke dalam tampilkan aplikasi Android yang akan kita bangun. Apa itu Fragment ?. Dilansir dari situs resmi Android, fragment adalah suatu tampilan/perilaku yang merupakan bagian dari antarmuka/activity pengguna. Kita bisa mengombinasikan beberapa fragment ke dalam satu activity untuk membangun UI multipanel dan menggunakan kembali sebuah fragment dalam beberapa activity. Kita juga bisa menganggap fragmen sebagai bagian modular dari activity yang memiliki daur hidup sendiri, menerima event masukan sendiri, dan yang bisa kita tambahkan atau hapus saat activity berjalan (semacam "sub activity" yang bisa digunakan kembali dalam activity berbeda).

Untuk membuat fragment, kita harus membuat subclass Fragment (atau subclass-nya yang ada). Class Fragment memiliki kode yang mirip seperti Activity. Class ini memiliki metode callback yang serupa dengan aktivitas, seperti onCreate(), onStart(), onPause(), dan onStop(). Sebenarnya, jika kita mengonversi aplikasi Android saat ini untuk menggunakan fragmen, kita mungkin cukup memindahkan kode dari metode callback activity ke masing-masing metode callback fragmen.

Gunakan Android Studio versi 3.4.1 keatas. Kita anggap semuanya sudah mengerti cara memulai projectnya. Pilih Empty Activity dan beri centang pada pilihan Use AndroidX Artifacts. Berikut adalah sumber daya inti dibutuhkan yang akan kita buat:

Source Code :<br>

- <a href="https://github.com/RizkyKhapidsyah/P_Fragments/blob/master/app/src/main/java/com/rizkykhapidsyah/p_fragments/MainActivity.java">MainActivity.java</a><br>
- <a href="https://github.com/RizkyKhapidsyah/P_Fragments/blob/master/app/src/main/java/com/rizkykhapidsyah/p_fragments/FragmentSatu.java">FragmentSatu.java</a><br>
- <a href="https://github.com/RizkyKhapidsyah/P_Fragments/blob/master/app/src/main/java/com/rizkykhapidsyah/p_fragments/FragmentDua.java">FragmentDua.java</a><br><br>

Layout/XML :

- <a href="https://github.com/RizkyKhapidsyah/P_Fragments/blob/master/app/src/main/res/layout/activity_main.xml">activity_main.xml</a><br>
- <a href="https://github.com/RizkyKhapidsyah/P_Fragments/blob/master/app/src/main/res/layout/fragment_satu.xml">fragment_satu.xml</a><br>
- <a href="https://github.com/RizkyKhapidsyah/P_Fragments/blob/master/app/src/main/res/layout/fragment_dua.xml">fragment_dua.xml</a><br>

Periksa dependencies pada build.gradle (Module: app) yang posisi defaultnya berada di bagian sebelah kiri dan pastikan sudah sesuai seperti berikut :

      dependencies {
          implementation fileTree(dir: 'libs', include: ['*.jar'])
          implementation 'androidx.appcompat:appcompat:1.1.0'
          implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
          testImplementation 'junit:junit:4.12'
          androidTestImplementation 'androidx.test:runner:1.2.0'
          androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'
      }


Pastikan build.gradle (Module: app) sudah sesuai dengan script diatas, jika belum, silahkan copy saja dan lakukan snychronize (online) dengan internet. Jika tidak ada yang keliru, berikut adalah hasilnya :<br><br>
<img src="https://github.com/RizkyKhapidsyah/P_Fragments/blob/master/results/R_Fragments%2000_00_00-00_00_11.80.gif"><br><br>
