package com.gozdedilarayilmaz;

public class engineer extends employee {// 'public' bu sınıfın her yerden erişilebilir olduğunu belirtir.
    //'extends'  employee engineer classını(sınıfının) Employee sınıfından miras aldığını belirtir.
    // " employee" sınıfından miras aldığını belirtir. Yani 'engineer' sınıfının tüm özelliklerine ve metodlarına sahip olur.
    public engineer(String name, double salary, int age) {// Bu sınıfın örneğini oluştururken çağırılan metodudur.

        super(name, salary, age);//'employee' sınıfının yapıcı metodunu çağırır.'name', 'salery', 'age' parametrelerini
        // 'employee' sınıfına iletir.


        //Bu sınıfın yapıcı metodunu çağırır.
    }

    public double getAnnualBonus() {//Engineer in yıllık bonusunu hesaplayan metottur. Ve bu metodu döndürür.

        return super.salary * .85;
        // Bu metot employee sınıfından alınan maaş/salary değişkenine erişir.
        //ne ile erişir? super anahtar kelimesi ile gelişir.
        // metotun genel işlevi ise maaşın %5 ini hesaplar ve döndürür. Bu engineerin yıllık bonusunu belirler.




    }
}

