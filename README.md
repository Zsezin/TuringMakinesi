# 1. Projenin Amacı 
Bu proje, kullanıcının girdiği 4 haneli PIN kodunun, sistemde kayıtlı sabit bir PIN ile tam olarak eşleşip eşleşmediğini kontrol eden bir Turing makinesi simülatörü geliştirmeyi amaçlar.

# 2. Programın İşleyişi 
```
Kullanıcıdan 4 haneli bir PIN kodu alınır.
Turing makinesi şeritinde giriş şu formatta yer alır:
  (# <Kullanıcı şifresi> # <Sistem şifresi> #).
Turing makinesi, ilk PIN ve ikinci PIN'in her bir rakamını karşılaştırmak için şeritte okuma-yazma ve hareket işlemleri yapar.
Her eşleşen karakter işaretlenir (örneğin, 'X' veya 'Y' ile).
Tüm karakterler eşleşirse, makine kabul durumuna (accept) geçer ve "Şifre doğru" mesajı verir.
Eşleşmeyen bir karakter bulunursa, makine reddet durumuna (reject) geçer ve "Şifre hatalı" mesajı verir.
Turing makinesi adım adım şerit durumunu göstererek simüle edilir.

```
# Örnek Girdi

Please enter your 4-digit PIN code: 1234

# Örnek Çıktı
```
--- Turing Machine Simulation Started ---
#1234#1234#
 ^ (head)
#X234#Y234#
  ^ (head)
#XX34#YY34#
   ^ (head)
#XXX4#YYY4#
    ^ (head)
#XXXX#YYYY#
     ^ (head)
Result: Correct PIN!

--- Turing Machine Simulation Started ---
#1235#1234#
 ^ (head)
#X235#Y234#
  ^ (head)
#XX35#YY34#
   ^ (head)
#XXX5#YYY4#
    ^ (head)
Result: Incorrect PIN!

--- Turing Machine Simulation Started ---
#1243#1234#
 ^ (head)
#X243#Y234#
  ^ (head)
#XX43#YY34#
   ^ (head)
Result: Incorrect PIN!
