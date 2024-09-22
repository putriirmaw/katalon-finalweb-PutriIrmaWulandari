# katalon-finalweb-PutriIrmaWulandari

Buat test case Create Akun , Login, Order dan Payment
Gunakan website
```sh
https://advantageonlineshopping.com/#/
```
Connect database dengan katalon
```sh
jdbc:postgresql://localhost:5432/postgres?currentSchema=public
```
Run database di Katalon
```sh
SELECT*FROM public.user;
```
Gunakan function if else untuk confirm password
```sh
def createAccount(String username, String password, String confirmpassword) {
    if (GlobalVariable.password == GlobalVariable.confirmpassword) {
        return "Akun untuk ${username} berhasil dibuat!"
    } else {
        return "Password do not match"
    }	
}
def result = createAccount(username, password, confirmpassword)
println(result)
```
Run test case pada Test Suite
