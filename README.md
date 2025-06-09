1. Projenin Amacı 
Bu proje, kullanıcının girdiği 4 haneli PIN kodunun, sistemde kayıtlı sabit bir PIN ile tam olarak eşleşip eşleşmediğini kontrol eden bir Turing makinesi simülatörü geliştirmeyi amaçlar.

2. İşleyişi 
Kullanıcıdan 4 haneli bir PIN kodu alınır.
Turing makinesi şeritinde giriş şu formatta yer alır:
# <Kullanıcı PIN> # <Sistem PIN> #

Turing makinesi, ilk PIN ve ikinci PIN'in her bir rakamını karşılaştırmak için şeritte okuma-yazma ve hareket işlemleri yapar.
Her eşleşen karakter işaretlenir (örneğin, 'X' veya 'Y' ile).
Tüm karakterler eşleşirse, makine kabul durumuna (accept) geçer ve "Şifre doğru" mesajı verir.
Eşleşmeyen bir karakter bulunursa, makine reddet durumuna (reject) geçer ve "Şifre hatalı" mesajı verir.
Turing makinesi adım adım şerit durumunu göstererek simüle edilir.
