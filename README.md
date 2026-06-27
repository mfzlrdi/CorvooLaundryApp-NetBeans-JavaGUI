# 🧺 Corvoo Laundry

> Aplikasi desktop manajemen laundry berbasis Java GUI — dibangun untuk mempermudah operasional bisnis laundry mulai dari login, transaksi, hingga cetak laporan.

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)](https://netbeans.apache.org/)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)]()

---

## 📌 Tentang Project

**Corvoo Laundry** adalah aplikasi desktop CRUD untuk mengelola bisnis laundry — dibangun dengan Java Swing (NetBeans) dan database MySQL. Aplikasi ini dirancang dengan tampilan modern menggunakan **FlatLaf** look and feel, lengkap dengan sistem login, manajemen data, dan fitur cetak laporan otomatis via **JasperReport**.

## ✨ Fitur Utama

- 🔐 **Login System** — autentikasi pengguna dengan toggle show/hide password
- 📋 **Menu Manajemen Laundry** — kelola data layanan & transaksi laundry
- 🗄️ **Koneksi Database MySQL** — penyimpanan data terstruktur & terpusat
- 🧾 **Cetak Laporan Layanan** — generate struk/laporan otomatis dengan JasperReport
- 🎨 **Tampilan Modern** — UI custom (rounded button, ikon interaktif) dengan FlatLaf theme

## 🛠️ Tech Stack

| Teknologi | Fungsi |
|---|---|
| ☕ Java (Swing) | Bahasa & GUI framework utama |
| 🖥️ NetBeans IDE | Tools development |
| 🐬 MySQL | Database |
| 📊 JasperReport / iReport | Generate & cetak laporan |
| 🎨 FlatLaf | Modern look and feel untuk UI |

## 📂 Struktur Project

```
Corvoo Laundry/
├── build/                  # Hasil compile (auto-generated)
├── database/
│   └── laundrycorvoo.sql   # Script database
├── lib/                    # Library eksternal (FlatLaf, JasperReport, MySQL Connector)
├── nbproject/               # Konfigurasi NetBeans
├── src/
│   └── AplikasiLaundry/
│       ├── icon/            # Icon & asset gambar
│       ├── koneksi.java      # Koneksi ke database
│       ├── login.java / login.form
│       ├── menu.java / menu.form
│       ├── cetakLayanan.jrxml / .jasper
│       └── buttonCustomRound.java
├── build.xml
├── manifest.mf
└── README.md
```

## 🚀 Cara Menjalankan

### 1. Persiapan Database
- Buka **phpMyAdmin** atau MySQL client favorit kamu
- Import file `database/laundrycorvoo.sql`
- Sesuaikan koneksi (host, username, password) di `koneksi.java`

### 2. Buka Project
```bash
# Clone repo
git clone https://github.com/username/Corvoo-Laundry.git
```
- Buka folder project menggunakan **NetBeans IDE**
- Pastikan semua library di folder `lib/` sudah ter-include (Clean and Build project)

### 3. Jalankan Aplikasi
- Klik **Run Project** (▶) di NetBeans, atau tekan `F6`
- Login menggunakan akun yang sudah didaftarkan di database

## 🗃️ Database

Struktur database tersedia di `database/laundrycorvoo.sql`, sudah termasuk tabel-tabel yang dibutuhkan aplikasi. Tinggal import langsung ke MySQL.

## 🌱 Status Pengembangan

Project ini masih berkembang — beberapa fitur tambahan (laporan keuangan, manajemen pelanggan, notifikasi status laundry) direncanakan untuk update selanjutnya.

## 🤝 Kontribusi

Saran, masukan, dan kontribusi sangat terbuka! Silakan buka **Issue** atau **Pull Request** kalau ada ide pengembangan. 😄

---

<p align="center">Made with ☕ & 🧺 — Corvoo Laundry</p>